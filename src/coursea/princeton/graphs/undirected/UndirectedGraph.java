package coursea.princeton.graphs.undirected;

import java.util.ArrayList;
import java.util.List;

/*
 * Defining APIs for the graph object
 */
public class UndirectedGraph
{

	private Integer edges;
	private Integer vertices;
	
	private Bag<Integer> adj[];
	
	/*
	 * constructor to create a graph with e objects
	 */
	public UndirectedGraph(Integer vertices)
	{
		this.vertices = vertices;
		this.adj = (Bag<Integer>[]) new Bag[vertices];
		for(int v=0; v<vertices; v++)
		{
			adj[v] = new Bag<Integer>();
		}
	}
	
	public Integer getEdges()
	{
		return edges;
	}
	
	public Integer getVertices()
	{
		return vertices;
	}
	
	/*
	 * Since it is an undirected graph we need to make two way logical connections
	 */
	public void addEdge(Integer v, Integer w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public List<Integer> getVerticesFromV(Integer v)
	{
		return adj[v].get();
	}
}
