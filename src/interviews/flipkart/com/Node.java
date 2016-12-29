package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class Node implements Comparable<Node> {

    private char data;
    private Node parent;
    private Node[] child;

    public Node(char data){
        this.data = data;
        this.parent = parent;
        this.child = new Node[2];
    }

    public void setParent(Node parent){
        this.parent = parent;
    }

    public Node getParent(){
        return parent;
    }

    public char getData(){
        return data;
    }


    @Override
    public int compareTo(Node o) {
        if(this.data == o.data){
            return 0;
        } else if(this.data>o.data){
            return 1;
        } else{
            return -1;
        }
    }

    public boolean equals(Node that){
        return this.data == that.data;
    }
}
