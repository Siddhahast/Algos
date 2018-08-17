package coursea.princeton.graphs.search;

import java.util.Iterator;
import java.util.Stack;

import coursea.princeton.graphs.undirected.UndirectedGraph;

public class DepthFirstSearch
{

	private UndirectedGraph graph;
	private int source;
	private boolean[] visited;
	private int[] edgeTo;
	private int[] colors;
	private int INT_MIN = -1;
	
	/*
	 * Constructor to set the graph object on which seraching is done
	 */
	public DepthFirstSearch(UndirectedGraph graph, int source)
	{
		this.graph = graph;
		this.source = source;
		/*
		 * Mark all the vertices visited as false.
		 */
		this.visited = new boolean[graph.getVertices()];
		this.edgeTo = new int[graph.getVertices()];
		this.colors = new int[graph.getVertices()];
		for(int w =0;w<edgeTo.length ; w++)
		{
			edgeTo[w] = INT_MIN;
			colors[w] = INT_MIN;
		}
	}
	
	public void search()
	{
		for(int i = source; i<graph.getVertices(); i++)
		{
			search(i);
		}
	}
	
	public boolean isBipartite(UndirectedGraph graph)
	{
		return isBipartite(graph, colors, source);
	}
	
	public boolean isBipartite(UndirectedGraph graph, int [] color, int v)
	{
		if(v == graph.getVertices()-1)
		{
			return true;
		}
		for(int c=0;c<2;c++)
		{
			if(isSafe(graph, v, color, c))
			{
				color[v] = c;
				if(isBipartite(graph, color, v+1))
				{
					return true;
				}
				color[v] = INT_MIN;
			}
		}
		return false;
	}
	
	/*
	 * Wrong implementation.. need to think more
	 */
	public boolean isCyclic(UndirectedGraph graph)
	{
		return isCyclic(graph, source);
	}
	
	private boolean isCyclic(UndirectedGraph graph, int v)
	{
		visited[v] = true;
		for(int w : graph.getVerticesFromV(v))
		{
			if(visited[w])
				return true;
			else {
				return isCyclic(graph, w);
			}
		}
		return false; 
	}
	
	public int[] getEdgeTo()
	{
		return edgeTo;
	}
	
	public Iterator<Integer> pathTo(int v)
	{
		if(hasPathTo(v) == false) return null;
		Stack<Integer> stack = new Stack<Integer>();
		for(int w = v; w != source; w = edgeTo[w])
		{
			stack.push(w);
		}
		stack.push(source);
		return stack.iterator();
	}
	
	private boolean hasPathTo(int v)
	{
		if(edgeTo[v]== INT_MIN)
		{
			return false;
		}
		return true;
	}
	
	private boolean isSafe(UndirectedGraph graph, int v, int[] color, int c)
	{
		for(int w: graph.getVerticesFromV(v))
		{
			if(color[w] == c)
				return false;
		}
		return true;
	}
	/*
	 * Recursive implementation of classic depth first search...
	 */
	private void search(int v)
	{
		if(!visited[v])
		{
			System.out.println("At Vertex : "+ v);			
		}
		visited[v] = true;
		for(int w : graph.getVerticesFromV(v))
		{
			if(visited[w] == false)
			{
				edgeTo[w] = v;
				search(w);
			}
		}
	}
}
