package Trees;

/**
 * Created by siddhahastmohapatra on 22/01/17.
 */
public class TreeValidator {

    Node prev;
    Node root;

    public TreeValidator(Node node){
        this.root = node;
    }

    /*
    Better way of implementing an algorithm to see whether a tree is a BST or not.
     */
    public boolean isBST(Node node){

        if(node!=null){

            if(!isBST(node.leftChild)){
                return false;
            }

            if(prev!=null && prev.data>node.data){
                return false;
            }
            prev = node;
            return isBST(node.rightChild);

        }
        return true;

    }

    /*
    Brute force way of testing a tree is a binary tree or not.
     */

    public boolean BST(Node node){

        /*
        In order traveral and store the node elements in an array.
        Check whetehr the array is in incresing order or not.
         */
        return true;

    }


}
