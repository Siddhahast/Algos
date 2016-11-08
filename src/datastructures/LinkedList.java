package datastructures;

/**
 * Created by siddhahastmohapatra on 07/11/16.
 */
public class LinkedList {

    private int elements;
    private Node head;

    public Node getHead(){
        return head;
    }

    public LinkedList(int data){
        this.elements = 0;
    }

    public void add(int data){
        head = add(new Node(data));
    }

    /**
     * Add a new node at the end of the linked list
     * @param node
     * @return
     */
    public Node add(Node node){
        if(head==null){
            head = node;
        } else{
            Node current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(node);
        }
        return head;
    }

    /**
     * Insert a node at the head of a linkedlist
     * @param head
     * @param data
     * @return
     */
    public Node insertHead(Node head, int data){
        if(head==null){
            head = new Node(data);
            return head;
        } else{
            Node newHead = new Node(data);
            newHead.setNext(head);
            head = newHead;
        }
        return head;
    }

    /**
     * Delete a node position recurssively
     * @param head
     * @param position
     * @return
     */
    public Node deleteNode(Node head, int position){
        if(head == null){
            return null;
        } else{
            if(position==0){
                return head.getNext();
            } else{
                head.setNext(deleteNode(head.getNext(), position-1));
                return head;
            }
        }
    }

    /* Add a new Node at a given postion in a linked list recurssively
     */
    public Node insertNode(Node head, int data, int position){
        if(head==null){
            head = new Node(data);
            return head;
        } else{
            if(position == 0){
                Node newNode = new Node(data);
                newNode.setNext(head.getNext());
                head.setNext(newNode);
                return head;
            } else{
                return insertNode(head.getNext(), data, position-1);
            }
        }
    }

    /*
    API to return the node where the intersection is there.
     */
    public Node detectCycleInLinkedList(Node head){
        if(head == null) {
            return null;
        } else{
            Node firstPtr = head;
            Node secondPointer = head;
            while(firstPtr.getNext()!=null && secondPointer.getNext()!=null){
                if(firstPtr.getData()==secondPointer.getData()){
                    break;
                } else{
                    firstPtr = firstPtr.getNext();
                    secondPointer = secondPointer.getNext().getNext();
                }
            }
            return firstPtr;
        }
    }

    /*
    Point the node previous to the intersecting node to null.
    This will remove the loop.
     */
    public void removeLoop(Node head, Node intersection){
        Node current = head;
        Node prev = null;
        while(current.getData()!=intersection.getData()){
            prev = intersection;
            current = current.getNext();
            intersection = intersection.getNext();
        }
        prev.setNext(null);
    }

}
