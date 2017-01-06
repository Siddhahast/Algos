package interviews.flipkart.tuples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class Graph {

    private Map<Character, Integer> map = new HashMap<Character, Integer>();
    private int vertices;
    List<Bag> adj;
    List<Bag> parents;

    public Graph(){
        vertices = 0;
        adj = new ArrayList<Bag>();
        parents = new ArrayList<Bag>();
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        System.out.print(g.adj.get(0)==null);
    }

    public List<Integer> adj(char c){
        if(map.get(c)!=null){
            return adj.get(map.get(c)).adj();
        } else{
            return null;
        }
    }

    public List<Integer> parents(char c){
        if(map.get(c)!=null){
            return parents.get(map.get(c)).adj();
        }
        return null;
    }

    public void addEdge(char parent, char child){
        int pIndex = getVertex(parent);
        int cIndex = getVertex(child);
        if(adj.get(pIndex)==null){
            Bag bag = new Bag();
            bag.add(cIndex);
            adj.add(pIndex, new Bag());
        } else{
            adj.get(pIndex).add(cIndex);
        }
        if(adj.get(cIndex)==null){
            Bag bag = new Bag();
            adj.add(cIndex, new Bag());
        }
        parents.get(cIndex).add(pIndex);
    }

    private int addVertexToGraph(char x){
        int index;
        if(map.get(x)==null){
            index = vertices;
            map.put(x, vertices++);
        } else{
            index = map.get(x);
        }
        return index;
    }

    public int getVertex(char c){
        if(map.get(c)==null){
            return -1;
        } else{
            return map.get(c);
        }
    }

    public int addVertex(char x){
        int i = vertices;
        if(map.get(x)==null){
            map.put(x, vertices++);
            adj.add(i, new Bag());
            parents.add(i, new Bag());
        } else{
            i = map.get(x);
        }
        return i;
    }

    public int V(){
        return vertices;
    }

}
