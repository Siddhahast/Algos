package interviews.flipkart.tuples;

import java.util.Map;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class TupleTree {

    Graph graph;
    UF uf;

    public TupleTree(){
        graph = new Graph();
        uf = new UF();
    }

    public void addEdge(char parent, char child){

        uf.makeSet(parent); uf.makeSet(child);
        graph.addVertex(parent); graph.addVertex(child);
        Node p = uf.find(parent);
        Node c = uf.find(child);


        if(graph.adj(parent).contains(graph.getVertex(child))){
            //throw duplicate tuples exception
            System.out.print("Duplicate tuples");
            return;
        } else if(graph.adj(parent).size()>=2){
            //throw multiple children exception
            System.out.print("More than 2 children");
            return;
        }else{
            graph.addEdge(parent, child);
        }

        if(graph.parents(parent).size()>1 || graph.parents(child).size()>1){
            //throw multiple parents exception
            System.out.print("Multiple parents");
            return;
        }
        if(p.data == c.data){
            //throw Cycle exception
            System.out.print("Cycle in graph");
            return;
        } else{
            uf.union(parent, child);
        }
    }

    public void multipleRootsExist(){
        GraphCC cc = new GraphCC(graph);
        if(cc.roots()>1){
            //throw multiple roots exception
            System.out.print("Multiple roots");
        }
    }

}
