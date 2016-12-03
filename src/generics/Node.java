package generics;

/**
 * Created by siddhahastmohapatra on 26/11/16.
 */
public class Node<T> {

    T t;
    Node next;

    public Node(T t){
        this.t = t;
        this.next = null;
    }

}
