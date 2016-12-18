package graph_algos;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class DigraphPaths {

    private boolean[] marked;
    private Stack<Integer> reversePostOrder;

    public DigraphPaths(Digraph digraph){
        marked = new boolean[digraph.getV()];
        reversePostOrder = new Stack<Integer>();

    }

    public void dfs(Digraph graph, int v){
        marked[v] = true;
        for (int w:graph.adj(v)){
            if(!marked[w]){
                dfs(graph, w);
            }
        }
        reversePostOrder.push(v);
    }

    public Iterable<Integer> getReversePostOrder(){
        return reversePostOrder;
    }
}
