package co.edu.poli.Edge;

import co.edu.poli.Node.Node;

public interface Edge {

	public abstract Node getNodeA();

	public abstract Node getNodeB();

	public abstract double getWeight();

	public abstract String getLabel();

	public abstract long getId();

	public abstract void setNodeA(Node nodeA);

	public abstract void setNodeB(Node nodeB);

	public abstract void setWeight(double weigth);

	public abstract void setLabel(String label);

	public abstract void setId(long id);

	public abstract boolean isDirect();

}