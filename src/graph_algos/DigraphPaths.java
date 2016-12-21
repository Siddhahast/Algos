package graph_algos;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class DigraphPaths {

    private boolean[] marked;
    private Stack<Integer> reversePostOrder;
    private int edgeTo[];
    private Set<Integer> set;
    private Digraph digraph;

    public DigraphPaths(Digraph digraph){
        marked = new boolean[digraph.getV()];
        this.digraph = digraph;
        reversePostOrder = new Stack<Integer>();
        edgeTo = new int[digraph.getV()];
        for (int i= 0;i<digraph.getV();i++){
            edgeTo[i] = -1;
        }
    }

    public void dfs(Digraph graph, int v){
        marked[v] = true;
        for (int w:graph.adj(v)){
            if(!marked[w]){
                dfs(graph, w);
                edgeTo[w] = v;
            }
        }
        reversePostOrder.push(v);
    }

    public Iterable<Integer> getReversePostOrder(){
        topologicalSort();
        return reversePostOrder;
    }

    public void topologicalSort(){
        for(int i=0;i<digraph.getV();i++){
            if(marked[i]==false) {
                dfs(digraph, i);
            }
        }
    }

    /*
    API for testing whether a edged digraph is cyclic/has a cycle or not.
     */
    public boolean isCyclic(Digraph graph, int v, Set<Integer> set){
        marked[v] = true;
        set.add(v);
        for (int w:graph.adj(v)){
            if(!marked[w]){
                boolean cycle = isCyclic(graph, w, set);
                if(cycle){
                    return true;
                } else{
                    continue;
                }
            } else{
                if(set.contains(w)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Digraph graph = new Digraph(6);

        graph.addEdge(0,3);
        graph.addEdge(2,4);
        graph.addEdge(4,3);
        graph.addEdge(3,5);
        graph.addEdge(5,1);
        DigraphPaths paths = new DigraphPaths(graph);
        Set<Integer> set = new HashSet<Integer>();
        System.out.print(paths.isCyclic(graph, 0, set));
    }

}
