package Trees;

/**
 * Created by siddhahastmohapatra on 08/11/16.
 */
public class Node {

    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data){
        this.data = data;
        leftChild = rightChild = null;
    }
}
