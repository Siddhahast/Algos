package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class EdgeWeightedDigraph {

    private int V;
    private int E;

    public int getV(){
        return V;
    }

    private Bag<DirectedEdge> adj[];

    public EdgeWeightedDigraph(int V){
        this.V = V;
        adj = new Bag[V];
        for(int i=0;i<V;i++){
            adj[i] = new Bag<DirectedEdge>();
        }
    }

    public void addEdge(DirectedEdge edge){
        adj[edge.from()].add(edge);
    }

    public Iterable<DirectedEdge> adj(int v){
        return (Iterable<DirectedEdge>) adj[v];
    }

}
