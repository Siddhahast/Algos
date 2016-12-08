package generics;

/**
 * Created by siddhahastmohapatra on 05/12/16.
 */
public interface MyMap<K, V> {

    public void put(K key, V value);
    public V get(K key);

}
