package co.edu.poli.Graph;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import co.edu.poli.Edge.Edge;
import co.edu.poli.Node.Node;

public interface Graph {

	public int cardinalityNodes();

	public abstract int cardinalityEdges();

	public abstract ArrayList<Node> getListNodes();

	public abstract ArrayList<Edge> getListEdges();

	public abstract HashMap<Long, ArrayList<Edge>> getGraph();

	public abstract void addNode(long idNode);

	public abstract void addNode(long idNode, Color color);

	public abstract void addNode(long idNode, String label);

	public abstract void addNode(long idNode, String label, Color color);

	public abstract void addEdge(long idEdge, Node nodeA, Node nodeB);

	public abstract void addEdge(long idEdge, Node nodeA, Node nodeB, double weight);

	public abstract void addEdge(long idEdge, Node nodeA, Node nodeB, String label);

	public abstract void addEdge(long idEdge, Node nodeA, Node nodeB, double weight, String label);
}
