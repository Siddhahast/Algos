package interviews.flipkart.com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class UF<T extends Comparable<T>> {

    private int roots = 0;
    private Map<T, Node> map = new HashMap<T , Node>();

    public UF(){
    }

    public Node find(Node node){
        if(node.getHead().equals(node)){
            return node;
        } else{
            node.setHead(find(node.getHead()));
            return node.getHead();
        }
    }

    public void union(Node x, Node y) throws Exception {
        Node xh = find(x);
        Node yh = find(y);

        if(!xh.equals(yh)){

        } else{
            if(x.getLeft().equals(y) && x.getRight().equals(y)){
                throw new DuplicateTuple();
            }
            if(y.getParent()!=null){
                throw new MutipleParentsExist();
            }

        }
    }

    private void addChildren(Node x, Node y) throws Exception {
        if(map.get(x.getData())==null){
            map.put((T) x.getData(), x);
        } else{
            if(x.getLeft()==null){
                x.setLeft(y);
                y.setParent(x);
            } else if(x.getRight()==null){
                x.setRight(y);
                y.setParent(x);
            } else{
                throw new ChildrenCountsException();
            }
        }
    }

    private void addParent(Node x, Node y){

    }

}
