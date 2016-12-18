package Trees;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class BSTUtils {

    public static void main(String[] args) {
        Node master1 = new Node(6);
        master1.leftChild = new Node(5);
        master1.rightChild = new Node(12);
        master1.leftChild.leftChild = new Node(4);
        master1.leftChild.rightChild = new Node(7);
        master1.rightChild.leftChild = new Node(8);
        master1.rightChild.rightChild = new Node(10);

        Node master2 = null;
        Node master3 = new Node(10);

        Node subtree1 = null;
        Node subtree2 = new Node(10);
        Node subtree3 = new Node(5);
        subtree3.leftChild = new Node(4);
        subtree3.rightChild = new Node (7);

        Node master4 = new Node(1);
        master4.leftChild = new Node(0);

        Node subtree4 = new Node(1);
        subtree4.rightChild = new Node(4);
        //subtree4.leftChild.leftChild = new Node(2);

        System.out.println(compareTrees(master4, subtree4));
        superImpose(master4, subtree4);
        System.out.println(master4.rightChild.data);
    }

    public static boolean compareTrees(Node tree1, Node tree2){

        if(tree1 == null || tree2==null){
            return true;
        } else if(tree1.data != tree2.data) {
            return false;
        }
        return compareTrees(tree1.leftChild, tree2.leftChild) && compareTrees(tree1.rightChild, tree2.rightChild);
    }


    public static Node superImpose(Node node1, Node node2){

        if(node1==null){
            return node2;
        } else if(node2 == null){
            return node1;
        }

        node1.leftChild = superImpose(node1.leftChild, node2.leftChild);
        node1.rightChild = superImpose(node1.rightChild, node2.rightChild);
        return node1;
    }


}
