package Trees;

/**
 * Created by siddhahastmohapatra on 19/01/17.
 */
public class TreeViewer {

    private boolean leftView;
    static int max_level = 0;

    public TreeViewer(){}

    public TreeViewer(boolean leftView){
        this.leftView = leftView;
    }

    public void view(Node node){
        treeView(node, 1);
    }

    private void treeView(Node node, int level){

        if(node==null){
            return;
        }

        if(level>max_level){
            System.out.print(node.data);
            max_level = level;
        }
        if(leftView) {
            treeView(node.leftChild, level+1);
            treeView(node.rightChild, level+1);
        } else{
            treeView(node.rightChild, level+1);
            treeView(node.leftChild, level+1);
        }

    }

    private static int maxLeft = 0;
    private static int maxRight = 0;

    public void topView(Node node, int left, int right){

        if(node==null){
            return;
        }

        if(left>maxLeft){
            maxLeft = left;
            System.out.println(node.data);
        }

        if(right>maxRight){
            maxRight = right;
            System.out.println(node.data);
        }

        topView(node.leftChild, left+1, right-1);
        topView(node.rightChild, left-1, right+1);
    }

}
