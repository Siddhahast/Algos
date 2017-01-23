package interviews.flipkart.com;

import java.util.*;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class TupleTree<T extends Comparable<T>> {


    private Map<T, Vertex<T>> map;
    UF<T> uf;

    public TupleTree(){
        map = new HashMap<T, Vertex<T>>();
    }

    public void add(Node x, Node y) throws Exception {
        uf.union(x, y);
    }

    public void addEdge(Vertex a, Vertex b) throws Exception {
        Vertex ap = null;
        Vertex bp = null;
        if(map.get(a.getData())==null){
            map.put((T) a.getData(), a);
            ap = a;
        } else{
            ap = map.get(a.getData());
        }

        if(map.get(b.getData())==null){
            map.put((T) b.getData(), b);
            bp = b;
        } else{
            bp = map.get(b.getData());
        }

        addParent(ap, bp);
        addChildren(ap, bp);


    }

    private void addParent(Vertex x, Vertex y) throws Exception{
        for(int i=0;i<y.nParents;i++){
            if(y.parents[i]==null){
                y.parents[i] = x;
                return;
            } else {
                if(y.parents[i].equals(x)){
                    throw new DuplicateTuple();
                }
            }
        }
        throw new MutipleParentsExist();
    }

    private void addChildren(Vertex x, Vertex y) throws Exception {
        for(int i=0;i<x.nChildren;i++){
            if(x.children[i]==null){
                x.children[i] = y;
                return;
            } else {
                if(x.children[i].equals(y)){
                    throw new DuplicateTuple();
                }
            }
        }
        throw new ChildrenCountsException();
    }

}
