package interviews.flipkart.com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class UF<T> {

    private Map<T, Node> map = new HashMap<T , Node>();

    public UF(){

    }

    public Node find(Node node){

        if(node.getParent().equals(node)){
            return node;
        } else{
            node.setParent(find(node.getParent()));
            return node.getParent();
        }

    }

    public void union(Node x, Node y) throws TreeCycleException {
        Node n1 = map.get(x.getData());
        Node n2 = map.get(y.getData());

        Node xp = find(n1);
        Node yp = find(n2);

        if(xp.equals(yp)){
            throw new TreeCycleException();
        } else{
            y.setParent(xp);
        }
    }

}
