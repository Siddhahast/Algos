package Trees;

/**
 * Created by siddhahastmohapatra on 31/12/16.
 */
public class RedBlackBST<Key extends Comparable<Key>, Value> {

    private static boolean RED = true;
    private static boolean BLACK = false;

    private class Node {
        Key key;
        Value value;
        Node left, right;
        boolean color;// color of the parent link.

        public Node(Key key, Value value, boolean color){
            this.key = key;
            this.value = value;
            this.color = color;
        }
    }

    public boolean isRed(Node x){
            if(x==null) return false;
            else return x.color==RED;
        }

    public Node rotateLeft(Node h){
            assert isRed(h.right);
            Node x = h.right;
            h.right = x.left;
            x.left = h;
            x.color = h.color;
            h.color = RED;
            return x;
        }

    public Node rotateRight(Node h){
            assert isRed(h.left);
            Node x = h.left;
            h.left = x.right;
            x.right = h;
            x.color = h.color;
            h.color = RED;
            return x;
    }

    public void flipcolors(Node x){
        assert (isRed(x.left) && isRed(x.right));
        x.left.color = BLACK;
        x.right.color = BLACK;
    }


    public Node put(Node h, Key key, Value value){
        if(h==null){
            return new Node(key, value, RED);
        }
        int cmp = key.compareTo(h.key);
        if(cmp>0){
            h.right = put(h.right, key, value);
        } else if(cmp<0){
            h.left = put(h.left, key , value);
        } else{
            h.value = value;
        }
        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }
        if(isRed(h.left) && isRed(h.left.left)){
            h = rotateRight(h);
        }

        if(isRed(h.left) && isRed(h.right)){
            flipcolors(h);
        }
        return h;
    }



}
