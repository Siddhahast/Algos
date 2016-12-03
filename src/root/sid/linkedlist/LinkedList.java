package root.sid.linkedlist;

/**
 * Created by siddhahast on 23/8/16.
 */
public class LinkedList {

    private Node head;
    private int size;
    private int nElements;

    public LinkedList(){
        nElements = 0;
    }

    /**
     * API to initialize/create a linkedlist in the system
     * @param size
     */
    public LinkedList(int size){
        this.size = size;
        nElements = 0;
    }

    /**
     * API to add a node to the list
     * Return true or false
     */
    public boolean add(Node node){
        if(head==null){
            head = node;
            return true;
        } else{
            Node current = head;
            if(nElements>=this.size){
                return false;
            }else {
                while(current.next()!=null){
                    current = current.next();
                }
                current.setNext(node);
                nElements++;
                return true;
            }

        }
    }

    /**
     *API to search for a particular node.
     * @param data
     * @return Node|null
     */
    public Node search(int data){

        Node current = head;
        if(current.get_data()==data){
            return current;
        }else{
            while(current.next()!=null){
                current = current.next();
                if(current.get_data()==data){
                    return current;
                }
            }
        }
        return null;
    }


    public Node delete(int data){

        if(head.get_data()==data){
            return head.next();
        }else{
            Node prev = head;
            Node current = head;
            return null;
        }
    }
}
