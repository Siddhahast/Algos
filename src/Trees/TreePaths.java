package Trees;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 22/01/17.
 */
public class TreePaths {

    private Node node;

    public TreePaths(Node node){
        this.node = node;
    }

    public void printRootToLeafPaths(){

    }

    private void printRootToLeafPath(Node node, List<Node> list){
        list.add(node);
        if(node.leftChild == null && node.rightChild==null){
            printPath(list);
            return;
        }

        printRootToLeafPath(node.leftChild, new ArrayList<>(list));
        printRootToLeafPath(node.rightChild, new ArrayList<>(list));

    }

    private void printPath(List<Node> list){

        for(Node node:list){
            System.out.print(node.data+ " ");
        }
        System.out.println();
    }

}
