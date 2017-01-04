package Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by siddhahastmohapatra on 12/12/16.
 *
 * Generic BST algo implementations.
 */
public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    public void put(Key key, Value value){
        root = put(root, key, value);
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x == null) return 0;
        return x.count;
    }

    public int rank(Key key){
        return rank(key, root);
    }

    public void deleteMin(){
        root = deleteMin(root);
    }

    private Node deleteMin(Node x){
        if(x.left==null) return x.right;
        x.left = deleteMin(x.left);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    public Key getMinimum(){
        return (Key) getMinimum(root).getKey();
    }

    public Node getMinimum(Node x){
        if(x == null){
            return null;
        } else{
            Node t = getMinimum(x.left);
            return x;
        }
    }

    private int rank(Key key, Node x){
        if(x == null) return 0;
        int cmp = key.compareTo((Key) x.getKey());
        if(cmp<0){
            return rank(key, x.left);
        } else if(cmp>0){
            return 1 + size(x.left) + rank(key, x.right);
        } else {
            return size(x.left);
        }
    }
    /*
    API for getting the floor of a key in tree ds
     */
    public Key floor(Key key){
        Node x = floor(root, key);
        if(x == null) return null;
        return (Key) x.getKey();
    }

    public Key ceiling(Key key){
        Node x = ceiling(root, key);
        if(x == null) return null;
        return (Key) x.getKey();
    }

    private Node ceiling(Node x, Key key){
        if(x == null) return null;
        int cmp = key.compareTo((Key) x.getKey());

        if(cmp>0){
            return ceiling(x.right, key);
        }
        if(cmp == 0){
            return x;
        }
        Node t = ceiling(x.left, key);
        if(t!=null) return t;
        return x;
    }

    private Node floor(Node x, Key key){
        if(x == null ){
            return null;
        }
        int cmp = key.compareTo((Key) x.getKey());
        if(cmp<0){
            return floor(x.left, key);
        }
        if(cmp==0){
            return x;
        }
        Node t = floor(x.right, key);
        if(t!=null){
            return t;
        } else{
            return x;
        }
    }

    public Node put(Node x, Key key, Value value){
        if(x == null){
            return new Node(key, value, 1);
        } else{
            int cmp = key.compareTo((Key) x.getKey());
            if(cmp<0){
                x.left = put(x.left, key, value);
            } else if(cmp>0){
                x.right = put(x.right, key, value);
            } else{
                x.value = value;
            }
            x.count = 1 + size(x.left) + size(x.right);
            return x;
        }
    }

    public Value get(Key key){
        if(root == null){
            return null;
        } else{
            Node x = root;
            while(x!=null){
                if(key.compareTo((Key) x.getKey())>0){
                    x = x.left;
                } else if(key.compareTo((Key) x.getKey())<0){
                    x = x.right;
                } else{
                    return (Value) x.getValue();
                }
            }
        }
        return null;
    }

    public void delete(Key key){

    }

    /*
    Basic Traversal API for the tree.
     */
    public Iterable<Key> iterator(){
        Queue<Key> q = new LinkedList<Key>();
        inOrder(root, q);
        return q;
    }

    private void inOrder(Node x, Queue<Key> q){
        if(x == null) return;
        inOrder(x.left, q);
        q.add((Key) x.getKey());
        inOrder(x.right, q);
    }

    private class Node<Key, Value>{
        Key key;
        Value value;
        Node left, right;
        int count;
        public Node(Key key,  Value value, int count){
            this.key = key;
            this.value = value;
            this.count = count;
        }

        public Key getKey(){
            return key;
        }
        public Value getValue(){
            return value;
        }
    }


    /*
    Generic serach algorithm impl for a BST using key.
     */
    public Value getValue(Key key){
        Node x = root;
        while(x!=null){
            int cmp = key.compareTo((Key) x.getKey());
            if(cmp>=1){
                x = x.left;
            } else if (cmp<=-1){
                x= x.right;
            } else{
                return (Value) x.getValue();
            }
        }
        return null;
    }

}
