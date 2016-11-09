package Trees;

/**
 * Created by siddhahastmohapatra on 08/11/16.
 */
public class BinaryTree {

    public BinaryTree(){

    }

    public void insert(){
        
    }

    //TODO:Complete the implementations of POST, PRE, IN
    public void traversal(String type){

    }

    public int getHeight(Node root){
        if(root==null){
            return -1;
        }else{
            int leftHeight = getHeight(root.leftChild)+1;
            int rightHeight = getHeight(root.rightChild)+1;
            if(leftHeight>rightHeight){
                return leftHeight;
            }else{
                return rightHeight;
            }
        }
    }

}
