package coursea.princeton.graphs.undirected;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

    private List<T> list;

    public Bag(){
        list = new ArrayList<T>();
    }

    public void add(T t){
        list.add(t);
    }

    public void delete(T t){
        list.remove(t);
    }

    public List<T> get(){
        return list;
    }

    public int size(){
        return list.size();
    }

}