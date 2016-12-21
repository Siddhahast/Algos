package cache;

/**
 * Created by siddhahastmohapatra on 19/12/16.
 */
public class Node<T extends Comparable<T>>  {

    private T t;
    int freq;

    Node<T> next;

    public Node(T t){
        this.t = t;
        this.freq = 0;
        this.next = null;
    }

    public T getT(){
        return t;
    }

}
