package collection_framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 28/01/17.
 */
public class MyMap<T, V> extends HashMap<T, V> {

    private int putCalls ;
    private int getCalls ;

    public MyMap(){
        super();
        getCalls = 0;
        putCalls = 0;
    }

    public V put(T t, V v){
        putCalls++;
        super.put(t, v);
        return v;
    }

    public int getCalls(){
        return getCalls;
    }

    public int putCalls(){
        return putCalls;
    }

    public V get(Object t){
        getCalls++;
        return super.get(t);
    }

}
