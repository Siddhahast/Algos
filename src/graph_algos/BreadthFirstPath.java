package graph_algos;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by siddhahastmohapatra on 16/12/16.
 */
public class BreadthFirstPath {

    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;
    private int s;

    public BreadthFirstPath(Graph G, int s){
        this.s = s;
        marked = new boolean[G.getV()];
        edgeTo = new int[G.getV()];
        distTo = new int[G.getV()];
    }

    public void bfs(Graph G, int v){

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        marked[s] = true;
        distTo[s] = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int w: G.adj(u)){
                if(!marked[w]){
                    distTo[w] = distTo[u]++;
                    edgeTo[w] = u;
                    q.add(w);
                }
            }
        }

    }

}
