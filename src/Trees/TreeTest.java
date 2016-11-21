package Trees;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by siddhahastmohapatra on 12/11/16.
 */
public class TreeTest {

    public static void main(String[] args) {
        Node node1 = new Node(72);
        Node node2 = new Node(63);
        Node node3 = new Node(7);
        Node node4 = new Node(68);
        Node node5 = new Node(89);
        Node node6 = new Node(19);
        Node node7 = new Node(11);
        Node node8 = new Node(17);
        Node node9 = new Node(13);
        Node node10 = new Node(14);
        Node node11 = new Node(90);
        Node node12 = new Node(16);
        Node node13 = new Node(22);

        /*
        Tree creation
        node1 is the root
         */
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        node2.rightChild = node5;
        node3.leftChild = node6;
        node3.rightChild = node7;

        node4.rightChild = node8;
        node8.leftChild = node11;

        node7.leftChild = node9;
        node7.rightChild = node10;
        node9.rightChild = node12;
        node12.leftChild = node13;

        BinaryTree tree = new BinaryTree();
        Map<Integer, List<Node>> map = tree.getRightShifts(node1);
        for(Map.Entry entry: map.entrySet()){

        }


    }
}
