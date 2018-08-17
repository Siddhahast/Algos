package coursea.princeton.graphs.search;

import java.util.LinkedList;
import java.util.Queue;

import coursea.princeton.graphs.undirected.UndirectedGraph;

public class BreadthFirstSearch
{

	private boolean[] marked;
	private int[] vertices;
	private int source;
	private int[] edgeTo;
	private int[] distTo;
	private UndirectedGraph graph;
	private int MIN_VETEX = -1;
	
	private Queue<Integer> queue;
	
	public BreadthFirstSearch(UndirectedGraph graph, int source)
	{
		this.source = source;
		this.graph = graph;
		this.vertices = new int[graph.getVertices()];
		
		this.edgeTo = new int[graph.getVertices()];
		this.distTo = new int[graph.getVertices()];
		this.marked = new boolean[graph.getVertices()];
		
		for(int i = 0;i <graph.getVertices(); i++)
		{
			edgeTo[i] = MIN_VETEX;
			marked[i] = false;
		}
		this.queue = new LinkedList<>();
	}
	
	public void search()
	{
		queue.add(source);
		int dist = 1;
		distTo[source] = 0;
		while(!queue.isEmpty())
		{
			int v = queue.poll();
			System.out.println("At Vertex "+ v);
			marked[v] = true;
			for (int w : graph.getVerticesFromV(v))
			{
				if (!marked[w])
				{
					marked[w] = true;
					queue.add(w);
					edgeTo[w] = v;
					distTo[w] = distTo[v] +1;
				}
			}
		}
	}
	
	public int[] getDistance()
	{
		return distTo;
	}
	
}
