package GraphDS;

import java.util.Iterator;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 24/11/16.
 */
public class Graph {

    private AdjList[] nodes;
    private int vertices;
    private int edges;

    public int getVertices(){
        return vertices;
    }

    public  int getEdges(){
        return edges;
    }

    public Graph(int vertices){
        this.vertices = vertices;
        nodes = new AdjList[vertices];
    }

    public void addEdge(int v, int w){
        if(nodes[v]!=null){
            nodes[v].add(w);
        } else{
            nodes[v] = new AdjList();
            nodes[v].add(w);
        }
    }

    public List<Node> adj(int v){
        return nodes[v].bag.getNodes();
    }

    public void printalladjnode(){
        List<Node> result = nodes[0].bag.getNodes();
        Iterator<Node> it = result.iterator();
        while(it.hasNext()){
            System.out.println(it.next().data);
        }
    }
}
