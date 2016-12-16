package graph_algos;

import java.util.Iterator;

/**
 * Created by siddhahastmohapatra on 15/12/16.
 */
public class Paths {

    boolean marked[];
    int edgeTo[];

    public Paths(Graph G, int s){
        marked = new boolean[G.getV()];
        edgeTo = new int[G.getV()];
    }

    public boolean hasPath(int v){
        return false;
    }

    public Iterable<Integer> pathTo(int v){
        return null;
    }

}
