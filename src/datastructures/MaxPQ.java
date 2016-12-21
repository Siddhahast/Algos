package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by siddhahastmohapatra on 21/12/16.
 */
public class MaxPQ<Key extends Comparable<Key>> implements Iterable<Key> {

    private int maxN;
    private Key[] keys;
    private int n;

    public MaxPQ(int maxN){
        this.maxN = maxN;
        n = 0;
        keys = (Key[]) new Comparable[maxN+1];
        keys[0] = null;
    }

    public void insert(Key v){
        if(n>maxN) resize();
        keys[++n] = v;
        swim(n);
    }

    public int size(){
        return n;
    }

    public MaxPQ(){}

    public boolean isEmpty(){
        return n==0;
    }

    public Key max(){
        return keys[1];
    }

    public void heapify(Key[] items){
        int cap = items.length;
        this.maxN = items.length;
        this.keys = (Key[]) new Comparable[maxN+1];
        for(int i=1;i<=maxN;i++){
            keys[i] = items[i-1];
        }
        for(int k= n/2;k>=1;k--){
            sink(k);
        }
    }

    public Key deleteMax(){
        if(isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        Key max = keys[1];
        keys[1] = keys[n--];
        sink(1);
        keys[n+1] = null;
        return max;
    }

    private void resize(){
        int n = 2*maxN;
        Key[] temp = (Key[]) new Comparable[n+1];
        for(int i=1;i<=maxN;i++){
            temp[i] = keys[i];
        }
        keys = temp;
        maxN = n;
    }

    private void sink(int k){
        while(2*k<=n){
            int j = 2*k;
            if(j<n && !greater(j, j+1)){
                j++;
            }
            if(greater(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    public boolean greater(int i, int j){
        return keys[i].compareTo(keys[j])>0;
    }

    private void exch(int i, int j){
        Key temp = keys[i];
        keys[i] = keys[j];
        keys[j] = temp;
    }

    private void swim(int k){
        while(k>1 && !greater(k/2, k)){
            exch(k/2, k);
            k = k/2;
        }
    }


    @Override
    public Iterator<Key> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Key>{
        private MaxPQ<Key> pq;
        public HeapIterator(){
            pq = new MaxPQ<Key>(size());
            for (int i=1;i<size();i++){
                pq.insert(keys[i]);
            }
        }
        @Override
        public boolean hasNext() {
            return !pq.isEmpty();
        }

        @Override
        public Key next() {
            if(pq.isEmpty()) throw new NoSuchElementException("Queue is exhausted");
            return pq.deleteMax();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported");

        }
    }

    public static void main(String[] args) {
        MaxPQ<Integer> pq = new MaxPQ<Integer>(10);
        int arr[] = {1,2, 3,4,5, 6,17,8,9,10};
        for(int i =0;i<arr.length;i++){
            pq.insert(arr[i]);
        }
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
