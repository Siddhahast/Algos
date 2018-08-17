package coursea.princeton.graphs.undirected;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vertex<O>
{

	private O o;
	private List<Vertex> edges;
	
	public Vertex(O o)
	{
		this.o = o;
	}
	
	public O getO()
	{
		return o;
	}
	
	public <O> void addEdge(Vertex<O> vertex)
	{
		if(edges == null)
		{
			edges = new ArrayList<>();
		}
		edges.add(vertex);
	}
	
	public <O> Iterator<Vertex> getEdges()
	{
		return edges == null ? null : edges.iterator();
	}

}
