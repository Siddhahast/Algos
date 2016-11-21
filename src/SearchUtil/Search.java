package SearchUtil;

/**
 * Created by siddhahastmohapatra on 15/11/16.
 */
public class Search {

    /*
    API for jump seraching in the arrays,
    1. Check the element in blocks.
    2. If the element is in a block range then search all the elements of the block,
        a. While checking all the elements in the block I need to see whether I dont jump over to the next block.
    3. If the element is not lieing in the block then return the index as -1.
     */
    public int jump_search(int[] arr, int x){
        int n = arr.length;
        int step = (int) Math.sqrt(arr.length);
        int prev = 0;
        while(arr[Math.min(step,n)-1]<x){
            prev = step;
            step = (int) (step + Math.floor(Math.sqrt(n)));
            if(prev>=n){
                return -1;
            }
        }
        while(arr[prev]<x){
            prev++;
            if(prev==Math.min(step, n)){
                return -1;
            }
        }
        if(arr[prev]==x){
            return prev;
        }
        return -1;
    }


    /*
    Generic Binary Search Implementation using Comparator interface
     */
    public int binary_search(Item[] items, Item item, int lo, int hi){
        if(lo==hi) {
            if(items[lo].compareTo(item) == 0) {
                return lo;
            } else {
                return -1;
            }
        }else{
            int mid = (hi+lo)/2;
            if(items[mid].compareTo(item)==0){
                return lo;
            } else if(items[mid].compareTo(item)==1){
                return binary_search(items, item, mid+1, hi);
            } else{
                return binary_search(items, item, lo, mid);
            }
        }
    }


    /*
    API for the
     */
    public int interpolate_search(int[] arr, int x, int n){
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int pos = lo +(((x-arr[lo])*(hi-lo))/(arr[hi]-arr[lo]));
            /*
            Formulae for interpolating the position of search block.
            This is based on the principle of the extracting the hi and lo index,
            assuming that all the elements in the array are uniformly located.
             */
            if(arr[pos]==x){
                return pos;
            }
             if(arr[pos]<x){
                 lo = pos+1;
             } else{
                 hi = pos-1;
             }
        }
        return -1;
    }



}
