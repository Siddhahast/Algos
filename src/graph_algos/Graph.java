package graph_algos;

/**
 * Created by siddhahastmohapatra on 15/12/16.
 */
public class Graph {
    int V;//vertices
    int E;//edges

    private Bag<Integer> adj[];

    public Graph(int V){
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for(int v = 0; v<V; v++){
            adj[v] = new Bag<Integer>();
        }
    }

    public void addEdge(int v , int w){
        adj[v].add(w);
        adj[w].add(v);
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
