package datastructures;

/**
 * Created by siddhahastmohapatra on 07/11/16.
 */
public class Node {

    private int data;
    private Node next;

    public Node(int data){
        this.data = data;

    }

    public void setNext(Node node){
        this.next = node;
    }

    public int getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }


}
