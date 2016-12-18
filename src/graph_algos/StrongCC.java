package graph_algos;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class StrongCC {

    private boolean marked[];
    private int scc[];
    private int counts;
    private Digraph graph;
    DigraphPaths paths;

    public StrongCC(Digraph graph){
        this.graph = graph;
        marked = new boolean[graph.getV()];
        counts = 0;
        paths = new DigraphPaths(graph);

    }

    public void computeConnectedComponents(Digraph graph, int v){
        paths.dfs(graph, 0);
        Stack<Integer> stack = (Stack<Integer>) paths.getReversePostOrder();
        for (int i:stack){
            if(!marked[i]){
                dfs(graph, i);
                counts++;
            }
        }
    }

    public void dfs(Digraph graph, int v){
        marked[v] = true;
        scc[v] = counts;
        for (int w:graph.adj(v)){
            if(!marked[w]){
                dfs(graph, w);
            }
        }
    }

    public boolean isStronglyConnected(int v, int w){
        return (scc[v] == scc[w]);
    }
}
