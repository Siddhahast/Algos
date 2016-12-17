package graph_algos;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 16/12/16.
 */
public class DepthFirstPaths {

    private boolean[] marked;
    private int[] edgeTo;
    private String[] color;
    private int s;

    public DepthFirstPaths(Graph G, int s){
        this.s = s;
        color[s] = "RED";
        marked = new boolean[G.getV()];
        edgeTo = new int[G.getV()];
    }

    private String nextColor(int v){
        if(color[v].equals("RED")){
            return "BLUE";
        }else{
            return "RED";
        }
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


    public boolean is_visited(int v){
        return marked[v];
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

    public boolean isCycle(Graph graph, int v){
        marked[v] = true;
        boolean is_cycle = false;
        for(int i=0; i<graph.getV(); i++){
            for (int w:graph.adj(i)){
                if(marked[w]==true){
                    is_cycle = true;
                    break;
                }else{
                    marked[w] = true;
                }
            }
        }
        return is_cycle;
    }

    public boolean isSafe(Graph graph, int[] color,int v, int c){
        for (int w:graph.adj(v)){
            if(color[w]==c){
                return false;
            }
        }
        return true;
    }

    /*
    API for finding the graph is bipartite
     */
    public boolean mGraphColoringUtil(Graph graph, int[] color, int v, int m){
        if(v==graph.getV()){
            return true;
        }
        for (int i=1;i<=m; i++){
            if(isSafe(graph, color, v, i)){

                color[v] = i;
                if(mGraphColoringUtil(graph, color, v+1, m)){
                    return true;
                }
                color[v] = 0;
            }
        }
        return false;
    }

    /*
    API for coloring the graph, here we can enter any value of m
    If m is 2 and the color is printed then graph is bipartite.
     */
    public void mColoringGraph(Graph graph, int m){
        int[] color = new int[graph.getV()];
        if(!mGraphColoringUtil(graph, color, 0, m)){
            System.out.println("Solution does not exist");
        }
        //Print the solution color array;
    }

    public boolean bipartite(Graph graph , int v){
        marked[v] = true;
        boolean bi = true;
        for(int w:graph.adj(v)){
            if(!marked[w]){
                color[w] = nextColor(v);
                bi = bipartite(graph, w);
                return bi;
            }else{
                if(color[w].equals(color[v])){
                    return false;
                }
            }
        }
        return bi;
    }



}
