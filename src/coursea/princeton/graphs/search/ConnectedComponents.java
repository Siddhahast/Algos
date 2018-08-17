package coursea.princeton.graphs.search;

import coursea.princeton.graphs.undirected.UndirectedGraph;

/*
 * Determine the connected components of a graph.
 */
public class ConnectedComponents
{

	private UndirectedGraph graph;
	private int count;
	private int id[];
	private boolean marked[];
	
	
	public ConnectedComponents(UndirectedGraph graph)
	{
		this.graph = graph;
		this.id = new int[graph.getVertices()];
		this.count = 0;
		this.marked = new boolean[graph.getVertices()];
		for(int i=0;i<graph.getVertices(); i++)
		{
			dfs(graph, i);
			count++;
		}
	}
	
	private void dfs(UndirectedGraph graph, int v)
	{
		marked[v] = true;
		id[v] = count;
		for(int w: graph.getVerticesFromV(v))
		{
			if(!marked[w])
			{
				dfs(graph, w);
			}
		}
	}
	
}
