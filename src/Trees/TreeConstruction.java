package Trees;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class TreeConstruction {

    public static void main(String[] args) {

        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        Node root = buildTree( pre, in, 0, len - 1);
        inOrder(root);

    }

    private static class Node{
        char data;
        Node left, right;

        public Node(char data){
            this.data = data;
        }
    }

    public static void inOrder(Node node){

        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data);
        inOrder(node.right);
    }


    private static int preIndex = 0;

    public static Node buildTree(char[] pre, char[] in, int start, int end){

        if(start>end){
            return null;
        }

        Node tNode = new Node(pre[preIndex++]);
        if(start==end){
            return tNode;
        }
        int inIndex = search(tNode.data, in, start, end);
        tNode.left = buildTree(pre, in, start, inIndex-1);
        tNode.right = buildTree(pre, in, inIndex+1, end);
        return tNode;
    }

    private static int search(char c, char[] in, int start, int end){
        int i;
        for(i=start;i<end;i++){
            if(in[i]==c){
                return i;
            }
        }
        return i;
    }
}
