package coursea.princeton.graphs.test;

import coursea.princeton.graphs.search.DepthFirstSearch;
import coursea.princeton.graphs.undirected.UndirectedGraph;

public class UndirectedGraphTest
{

	public static void main(String[] args)
	{
	
		UndirectedGraph graph = new UndirectedGraph(12);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		//graph.addEdge(4, 5);
		graph.addEdge(1, 5);
		//graph.addEdge(2, 5);
		//graph.addEdge(1, 2);
		graph.addEdge(5, 6);
		graph.addEdge(6, 7);
		graph.addEdge(6, 8);
		//graph.addEdge(7, 8);
		graph.addEdge(8, 9);
		graph.addEdge(10, 11);
		
		DepthFirstSearch dfs = new DepthFirstSearch(graph, 0);
		boolean isCyclic = dfs.isCyclic(graph);
		
		System.out.println(isCyclic);
	}
	
	
}
