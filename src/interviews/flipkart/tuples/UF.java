package interviews.flipkart.tuples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class UF {

    private Map<Character, Node>  map = new HashMap<>();

    public UF(){

    }

    public void union(char a, char b){
        Node n1 = find(a);
        Node n2 = find(b);

        if(n1.data == n2.data){
            return;
        }
        n2.parent = n1;
    }

    public Node find(char a){
        if(map.get(a)==null){
            return null;
        } else{
            Node x = map.get(a);
            return find(x);
        }
    }

    public Map<Character, Node> getMap(){
        return map;
    }

    private Node find(Node node){
        Node parent = node.parent;
        if(parent.data == node.data){
            return parent;
        } else{
            node.parent = find(node.parent);
            return node.parent;
        }
    }


    public void makeSet(char x){
        if(map.get(x)==null){
            map.put(x, new Node(x));
        }
    }

}
