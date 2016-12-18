package graph_algos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 16/12/16.
 */
public class DepthFirstPaths {

    private boolean[] marked;
    private int[] edgeTo;
    private String color[];
    private int s;

    public DepthFirstPaths(Graph G, int s){
        this.s = s;
        this.color = new String[G.getV()];
        this.color[s] = "RED";
        this.marked = new boolean[G.getV()];
        this.edgeTo = new int[G.getV()];
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
        System.out.print(v);
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

    public boolean cyclicUtil(Graph graph, int v, int parent){
        marked[v] = true;
        for (int w:graph.adj(v)){
            if(!marked[w]){
                if(cyclicUtil(graph, w, v)) return true;
            } else if(w!=parent){
                return true;
            }
        }
        return false;
    }

    /*
    API to test whether a graph has a cycle or not.
     */
    public boolean isCyclic(Graph graph){
        for (int i=0;i<graph.getV();i++){
            marked[i] = false;
        }
        for (int i=0;i<graph.getV();i++){
            if(!marked[i]){
                if (cyclicUtil(graph, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isCycle(Graph graph, int v, Set<Integer> visited){
        visited.add(v);
        boolean cycle = false;
        for (int w:graph.adj(v)){
            if(visited.contains(w)){
                if(edgeTo[w]!=v){
                    cycle = true;
                }
            } else{
                edgeTo[w] = v;
                cycle = isCycle(graph, w, visited);
            }
        }
        return cycle;
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

    public void printColors(int[] color){
        for (int w:color){
            System.out.print(w);
        }
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
        printColors(color);

        //Print the solution color array;
    }

    public boolean bipartite(Graph graph , int v){
        int[] color = new int[graph.getV()];
        if(!mGraphColoringUtil(graph, color, 0, 2)){
            return false;
        }
        return true;
    }

    public void eulerCycle(Graph graph, int v, Stack<Integer> stack){
        marked[v] = true;
        for (int w:graph.adj(v)){
            if(marked[w]){

            }
        }
    }

    private boolean isConnected(Graph graph){
        for(int i=0; i<graph.getV();i++){

        }
        return false;
    }


}
