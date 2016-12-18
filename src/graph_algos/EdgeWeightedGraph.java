package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class EdgeWeightedGraph {

    private int V;
    private int E;

    public int V(){
        return V;
    }

    private Bag<Edge> adj[];

    public EdgeWeightedGraph(int V){
        this.V = V;
        adj = new Bag[V];
        for (int i =0;i<V;i++){
            adj[i] = new Bag<Edge>();
        }
    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);adj[w].add(e);
    }

    public Iterable<Edge> adj(int v){
        return (Iterable<Edge>) adj[v];
    }

    public Iterable<Edge> edges(){
        return null;
    }
}
