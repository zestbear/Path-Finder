package model;


import java.util.ArrayList;
import java.util.Collection;

public class Node implements INode {

	private boolean open = true;
	private boolean visited = false;
	private boolean selected = false;

	private final Collection<IEdge> edges = new ArrayList<IEdge>();
	private INode predecessor;
	private int cost = 0;
	private int heuristic = 0;

	public void reset() {
		predecessor = null;
		cost = 0;
		open = true;
		visited = false;
		selected = false;
	}

	@Override
	public boolean isOpen() {
		return open;
	}

	@Override
	public void setOpen(boolean open) {
		this.open = open;
	}

	@Override
	public boolean isVisited() {
		return visited;
	}

	@Override
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public boolean isSelected() {
		return selected;
	}

	@Override
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean addEdge(IEdge edge) {
		return this.edges.add(edge);
	}
	
	public boolean removeEdge(IEdge edge) {
		return this.edges.remove(edge);
	}

	@Override
	public Collection<IEdge> getEdges() {
		return this.edges;
	}

	@Override
	public INode getPredecessor() {
		return predecessor;
	}

	@Override
	public void setPredecessor(INode node) {
		this.predecessor = node;
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int getHeuristic() {
		return heuristic;
	}

	@Override
	public void setHeuristic(int heuristic) {
		this.heuristic = heuristic;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(heuristic + cost);
		sb.append("(");
		sb.append(cost);
		sb.append(",");
		sb.append(heuristic);
		sb.append(")");;
		return sb.toString();
	}

}
