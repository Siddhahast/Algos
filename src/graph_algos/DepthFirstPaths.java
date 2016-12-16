package graph_algos;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 16/12/16.
 */
public class DepthFirstPaths {

    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DepthFirstPaths(Graph G, int s){
        this.s = s;
        marked = new boolean[G.getV()];
        edgeTo = new int[G.getV()];
    }

    public void dfs(Graph G, int v){
        marked[v] = true;
        for (int w: G.adj(v)){
            if(!marked[w]){
                dfs(G, w);
                edgeTo[w] = v;
            }
        }
    }

    public boolean hasPath(int v){
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPath(v)) return null;
        else{
            Stack<Integer> path = new Stack<Integer>();
            for(int x = v; x!=s; x = edgeTo[v]){
                path.push(x);
            }
            path.push(s);
            return path;
        }
    }

}
