package union_find;

import graph_algos.Vertex;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class UF<V extends Vertex> {

    Set<V> set;
    private int n;
    private int[] points;


    public UF(int n){
        this.n = n;
        set = new HashSet<V>();
    }

    public void union(V v, V w){
        if(!v.getParent().equals(v)){
            union((V) v.getParent(), w);
        } else{
            w.setParent(v);
            if(!set.contains(v)){set.add(v);}
            if(!set.contains(w)){set.add(w);}
        }
    }

    public boolean isConnected(V v, V w){
        return v.getParent().equals(w.getParent());
    }

    public V id(V v){
        return (V) v.getParent();
    }

    public V find(V v){
        return (V) v.getParent();
    }

    public int root(int p){
        while(p!=points[p]){
            p = points[p];
        }
        return p;
    }

    public void union(int p, int q){
        int pid = root(p);
        int qid = root(q);
        points[pid] = qid;
    }

    public boolean connected(int p, int q){
        return (root(p)==root(q));
    }

    public int find(int p){
        return points[p];
    }

    public void displayPoints(){
        for (int i: points){
            System.out.println(i);
        }
    }
}
