package graph_algos;

/**
 * Created by siddhahastmohapatra on 17/12/16.
 */
public class Graph_Test {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        BreadthFirstPath path = new BreadthFirstPath(graph, 5);
        path.dispalyDist();

    }
}
