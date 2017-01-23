package interviews.flipkart.tuples;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class Node {

    public char data;
    public Node parent;

    public Node(char data){
        this.data = data;
        this.parent = this;
    }

}
