package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class Digraph {

    private int V;
    private int E;

    private Bag<Integer> adj[];

    public Digraph(int V){
        this.V = V;
        adj = new Bag[V];
    }

    public void addEdge(int v , int w){
        adj[v].add(w);
    }

    public int getV(){
        return V;
    }

    public int E(){
        return E;
    }


    /*
    Adjoining vertices to a given vertex v.
     */
    public Iterable<Integer> adj(int v){
        return adj[v].get();
    }


}
