package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by siddhahastmohapatra on 20/12/16.
 */
public class IndexMinPQ<Item extends Comparable<Item>> implements Iterable<Integer> {

    private int maxN;
    private int n;
    private Item[] items;
    private int[] pq;
    private int[] qp;

    public IndexMinPQ(int maxN){
        this.maxN = maxN;
        items = (Item[]) new Comparable[maxN+1];
        pq = new int[maxN+1];
        qp = new int[maxN+1];
        for(int i=0;i<=maxN;i++){
            qp[i] = -1;
        }
    }


    public boolean isEmpty(){
        return n==0;
    }

    public boolean contains(int i){
        if(i<0 || i>maxN)
            throw new IndexOutOfBoundsException();
        return qp[i] != -1;
    }

    public int size(){
        return n;
    }

    public void insert(int i, Item item){
        if(i<0 || i>maxN) throw new IndexOutOfBoundsException("The index is already occupied");
        if(contains(i)) throw new IllegalArgumentException("The index is already occupied");
        qp[i] = n;
        pq[n] = i;
        n++;
        items[i] = item;
        swim(n);
    }

    public int minIndex(){
        return pq[1];
    }

    public Item minItem(){
        return items[pq[1]];
    }

    public int deleteMin(){
        if(n==0) throw new NoSuchElementException("Empty Priority Queue");
        int min = pq[1];
        exch(1, n--);
        sink(1);
        qp[min] = -1;
        items[n+1] = null;
        pq[n+1] = -1;
        return min;
    }

    public void changeKey(int i, Item item){
        if(i<0 || i>=maxN) throw new ArrayIndexOutOfBoundsException();
        items[i] = item;
        swim(qp[i]);
        sink(qp[i]);
    }

    public void decreaseKey(int i, Item item){

    }


    public boolean less(int i, int j){
        if(items[pq[i]].compareTo(items[pq[j]])<=0){
            return true;
        } else{
            return false;
        }
    }

    private boolean greater(int i, int j){
        //System.out.print("Child- "+i +" Parent- "+j+" ");
        return items[pq[i]].compareTo(items[pq[j]])>0;
    }

    private void swim(int k){
        while(k>=1 && greater(k/2, k)){
            exch(k, k/2);
            k = k/2;
        }
    }

    private void exch(int i, int j){
        int swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    private void sink(int k){
        while(2*k<=n){
            int j = 2*k;
            if(greater(j , j+1) && j<n){
                j++;
            }
            if(!greater(k, j)) break;
            exch(k,j);
            k = j;
        }
    }

    public Iterator<Integer> iterator() { return new HeapIterator(); }

    private class HeapIterator implements Iterator<Integer> {
        // create a new pq
        private IndexMinPQ<Item> copy;

        // add all elements to copy of heap
        // takes linear time since already in heap order so no keys move
        public HeapIterator() {
            copy = new IndexMinPQ<Item>(pq.length - 1);
            for (int i = 1; i <= n; i++)
                copy.insert(pq[i], items[pq[i]]);
        }

        public boolean hasNext()  { return !copy.isEmpty();                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            return copy.deleteMin();
        }
    }


    public static void main(String[] args) {
        // insert a bunch of strings
        String[] strings = { "it", "was", "the", "best", "of", "times", "it", "was", "the", "worst" };

        IndexMinPQ<String> pq = new IndexMinPQ<String>(strings.length);
        for (int i = 0; i < strings.length; i++) {
            pq.insert(i, strings[i]);
        }
        System.out.println("Delte min keys");
        // delete and print each key
        while (!pq.isEmpty()) {
            int i = pq.deleteMin();
            System.out.println(i + " " + strings[i]);
        }
        System.out.println();

        // reinsert the same strings
        for (int i = 1; i <= strings.length; i++) {
            pq.insert(i, strings[i]);
        }

        // print each key using the iterator
        for (int i : pq) {
            System.out.println(i + " " + strings[i]);
        }
        while (!pq.isEmpty()) {
            pq.deleteMin();
        }

    }
}
