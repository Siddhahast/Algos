package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class Edge implements Comparable<Edge> {
    private int v, w;
    private double weight;
    public Edge(int v, int w, double weight){

    }
    @Override
    public int compareTo(Edge o) {
        if(this.weight<o.weight) return -1;
        else if(this.weight>o.weight) return 1;
        else return 0;
    }

    public int other(int vertex){
        if(v==vertex) return w;
        else return v;
    }

    public int either(){
        return v;
    }


}
