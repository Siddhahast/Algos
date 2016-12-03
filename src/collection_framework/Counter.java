package collection_framework;

import java.util.Iterator;

/**
 * Created by siddhahastmohapatra on 27/11/16.
 */
public class Counter implements Iterable<Node> {

    private Node t;
    private int count;

    public Counter(Node t){
        this.t = t;
    }

    public Iterator<Node> iterator() {
        return new Iterator<Node>() {
            private Node curr = t;
            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public Node next() {
                Node prev = curr;
                curr = curr.next;
                return prev;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
