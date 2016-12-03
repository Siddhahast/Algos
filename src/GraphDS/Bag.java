package GraphDS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 25/11/16.
 */
public class Bag {

    private Node head;

    public Bag(){

    }

    public void add(Node node){
        if(head==null){
            head = node;
        } else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public Node getNode(int data){
        if(head == null ){
            return null;
        } else{
            Node curr = head;
            while(curr.next!=null && curr.data!=data){
                curr = curr.next;
            }
            if(curr.data == data ){
                return curr;
            } else{
                return null;
            }
        }
    }

    public List<Node> getNodes(){
        List<Node> list = new ArrayList<Node>();
        Node curr = head;
        while(curr!=null){
            list.add(curr);
            curr = curr.next;
        }
        return list;
    }

}
