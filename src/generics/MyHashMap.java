package generics;

/**
 * Created by siddhahastmohapatra on 05/12/16.
 */
public class MyHashMap<K, V> implements MyMap<K, V> {

    private K key;
    private V value;

    private Node[] nodes;
    private int[] hashCodes;

    private class Node<K, V>{
        V v;
        K k;
        Node next;

        public Node(K key, V value){
            this.k = key;
            this.v = value;
            this.next = null;
        }

    }

    public MyHashMap(){
        hashCodes = new int[16];
    }

    /*
    Generic simple implementation of a hashmap put api.
     */
    public void put(K key,V value){

        int hashIndex = key.hashCode()%16;
        if(nodes[hashIndex]==null){
            nodes[hashIndex] = new Node(key, value);
        } else{
            Node curr = nodes[hashIndex];
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = new Node(key, value);
        }

    }

    /*
    Genric simple implementation of a hashmap get api.
     */
    public V get(K key){
        Node curr = nodes[key.hashCode()%16];
        if(curr== null){
            return null;
        } else{
            Node prev = curr;
            while(curr!=null){
                if(curr.k.equals(key)){
                    return (V) curr.v;
                } else{
                    curr = curr.next;
                }
            }
            return null;
        }
    }

}
