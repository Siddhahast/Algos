package graph_algos;

import datastructures.IndexMinPQ;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class ShortestPath {
    private int s; // Source of the edged weight digraph

    private IndexMinPQ<Double> pq;
    private DirectedEdge edgeTo[];
    private double distTo[];


    public ShortestPath(EdgeWeightedDigraph graph, int s){
        this.s = s;
        edgeTo = new DirectedEdge[graph.getV()];
        distTo = new double[graph.getV()];
        for (int i=0;i<graph.getV();i++){
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        pq = new IndexMinPQ<>(graph.getV());
    }

    public void djiktraSP(EdgeWeightedDigraph graph, int s){
        pq.insert(s, 0.0);
        distTo[s] = 0.0;
        while(!pq.isEmpty()){
            int v = pq.deleteMin();
            for(DirectedEdge edge:graph.adj(v)){
                relax(edge);
            }
        }

    }

    private void relax(DirectedEdge edge){
        int v = edge.from();
        int w = edge.to();
        if(distTo[v]+edge.weight()<distTo[w]){
            distTo[w] = distTo[v]+edge.weight();
            edgeTo[w] = edge;
        }
        if(pq.contains(w)){
            pq.decreaseKey(w, distTo[w]);
        } else{
            pq.insert(w, distTo[w]);
        }
    }

}
