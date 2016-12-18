package graph_algos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 15/12/16.
 */
public class Bag<T> {

    List<T> list;

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
