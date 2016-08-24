package root.sid.linkedlist;

/**
 * Created by siddhahast on 23/8/16.
 */
public class Node {

    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }

    public int get_data(){
        return this.data;
    }

    public Node next(){
        return this.next;
    }

    public void setNext(Node node){
        this.next = node;
    }
}
