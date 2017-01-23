package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class Node<T extends Comparable<T>> implements Comparable<Node> {

    private T data;
    private Node parent;
    private Node head;
    private Node left, right;

    public Node(T data){
        this.data = data;
        this.head = this;
        this.parent = this;
        this.left = null; this.right = null;
    }

    public void setParent(Node parent){
        this.parent = parent;
    }

    public Node getParent(){
        return parent;
    }

    public T getData(){
        return data;
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node node){
        this.head = node;
    }

    @Override
    public int compareTo(Node o) {
        if(this.data.compareTo((T) o.getData())==0){
            return 0;
        } else if(this.data.compareTo((T) o.getData())>0){
            return 1;
        } else{
            return -1;
        }
    }

    public boolean equals(Node that){
        return this.data == that.data;
    }

    public void setLeft(Node x){
        this.left = x;
    }

    public void setRight(Node x){
        this.right = x;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

}
