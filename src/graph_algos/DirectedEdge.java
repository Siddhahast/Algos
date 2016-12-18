package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class DirectedEdge {

    private int v;
    private int w;
    private double weight;

    public DirectedEdge(int v, int w, double weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int to(){
        return w;
    }

    public int from(){
        return v;
    }

    public double weight(){
        return weight;
    }

}
