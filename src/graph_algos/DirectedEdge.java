package graph_algos;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class DirectedEdge implements Comparable<DirectedEdge>{

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

    @Override
    public int compareTo(DirectedEdge o) {
        if(this.weight>o.weight()){
            return 1;
        }else if(this.weight<o.weight()){
            return -1;
        }else{
            return 0;
        }
    }
}
