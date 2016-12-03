package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by siddhahastmohapatra on 26/11/16.
 */
public class Bag<Item>{

    Node head;

    public Bag(){

    }

    public void add(Item t){
        if(head == null){
            head = new Node(t);
        } else{
            Node curr = head;
            while(curr.next!= null){
                curr = curr.next;
            }
            curr.next = new Node(t);
        }
    }

    public void display_all(){
        if(head == null){
            System.out.println("Empty list");
        } else{
            Node curr = head;
            while(curr.next!= null){
                System.out.println(curr.t.toString());
                curr = curr.next;
            }
            System.out.println(curr.t.toString());
        }
    }

}
