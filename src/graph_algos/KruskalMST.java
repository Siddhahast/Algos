package graph_algos;

import union_find.UF;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class KruskalMST {

    private Queue<Edge> mst = new LinkedList<Edge>();



    public KruskalMST(EdgeWeightedGraph graph){
        Queue<Edge> edges = new PriorityQueue<Edge>();
        for(Edge e:graph.edges()){
            edges.add(e);
        }
        UF uf = new UF(graph.V());

        while(!edges.isEmpty() && mst.size()<=graph.V()-1){
            Edge e = edges.poll();
            int v = e.either(); int w = e.other(v);
            if(!uf.connected(v,w)){
                uf.union(v,w);
                mst.add(e);
            }
        }
    }

    public Iterable<Edge> edges(){
        return mst;
    }

}
