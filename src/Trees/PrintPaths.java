package Trees;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by siddhahastmohapatra on 08/02/17.
 */
public class PrintPaths {

    private static boolean foundBoth = false;
    public static List<Node> paths = new ArrayList<Node>();

    public static boolean printPaths(Node node, Node p, Node q){

        if(node == null){
            return false;
        }

        if(node.data == p.data || node.data == q.data){
            addToPath(node);
            if(!foundBoth){
                foundBoth = findOther(node, node.data==p.data?q:p);
            }
        }

        if(!foundBoth){
            boolean left = printPaths(node.leftChild, p, q);
            if(left){
                addToPath(node);
            }

            boolean right = printPaths(node.rightChild, p, q);
            if(right){
                addToPath(node);
            }

            return (left||right);
        } else{
            return true;
        }

    }

    private static void addToPath(Node node){
        paths.add(node);
    }

    public static boolean findOther(Node node, Node x){

        if(node == null){
            return false;
        }

        if(node.data == x.data){
            addToPath(node);
            return true;
        }

        boolean left = findOther(node.leftChild, x);
        if(left){
            addToPath(node);
            return true;
        }

        boolean right = findOther(node.rightChild, x);
        if(right){
            addToPath(node);
            return true;
        }
        return false;

    }

}
