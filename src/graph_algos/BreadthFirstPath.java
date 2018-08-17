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
    Queue<Integer> q = new LinkedList<Integer>();

    public BreadthFirstPath(UndirectedGraph G, int s){
        this.s = s;
        marked = new boolean[G.getV()];
        edgeTo = new int[G.getV()];
        distTo = new int[G.getV()];
        bfs(G, s);
    }

    public void bfs(UndirectedGraph G, int v){

        q.add(v);
        marked[v] = true;
        distTo[v] = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            int dist = distTo[u]++;
            for(int w: G.adj(u)){
                if(!marked[w]){
                    distTo[w] = dist;
                    marked[w] = true;
                    edgeTo[w] = u;
                    q.add(w);
                }
            }
        }

    }

    public void dispalyDist(){
        for(int i: distTo){
            System.out.println(i);
        }
    }

}
