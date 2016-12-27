package classics;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by siddhahastmohapatra on 18/11/16.
 */
public class classic_questions {

    public static void rotate(int[] arr, int k){
        int[] it = new int[k];
        int i = 0;
        for(i = 0;i<k;i++){
            it[i] = arr[arr.length-k+i];
        }
        int j = 0;
        i = arr.length-k;
        while(i<arr.length){
            arr[i++] = arr[j++];
        }
        int m = 0;
        while(m < j){
            arr[m] = it[m];
            m++;
        }
    }


    /**
     * Detect if two numbers are of opposite sign
     * Logic is as follows:
     * 1. If the signed bit is 0, then positive
     * 2. If signed bit is 1 , then negative
     */

    public void opposites(int x, int y){
        if(oppositeSigns(x,y)==true){
            System.out.print("Numbers are opposite signs");
        } else{
            System.out.print("Numbers are of same sign");
        }
    }

    /*
    Xor operation is faster than normal multiplication.
    So Faster is better.
     */
    private boolean oppositeSigns(int x, int y){
        return ((x^y)<0);
    }

    /*
    Binary representation of a number
     */
    public static int[] binary_representation(int x){
        Stack<Integer> stack = new Stack<Integer>();

        while(x!=0){
            stack.push((x%2));
            x = x/2;
        }
        int[] bits = new int[(int) Math.ceil(stack.size()/8) * 8];
        int n =  (((int) Math.ceil(stack.size()/8)*8) - stack.size());
        while(!stack.isEmpty()){
            bits[n++]= stack.pop();
        }
        return bits;
    }

    public void swap_lexicographically(char[][] ch){
        

    }

    public static int max(int a, int b){
        if(a>=b){
            return a;
        } else{
            return b;
        }
    }

    public static int min(int a, int b){
        if(a>=b){
            return b;
        } else{
            return a;
        }
    }


    /*
    Genric function for the water trapping problem.
     */
    public static int getWaterCapacity(int[] arr){
        int[] left = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];

        for(int i=1;i<arr.length; i++){
            left[i] = max(left[i-1], arr[i]);
        }
        right[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i>=0;i--){
            right[i] = max(right[i+1], arr[i]);
        }
        int water = 0;
        for(int i=0;i<arr.length;i++){
            water = water + (min(left[i],right[i])-arr[i]);
        }
        return water;
    }

    /*
    Fibonacci Series Dynamic Memoization.
     */
    private static int MAX_VALUE = 10000;
    private static int NIL = -1;
    private static int[] lookup = new int[MAX_VALUE];

    public static void initialize(){
        for(int i=0;i<MAX_VALUE;i++){
            lookup[i] = NIL;
        }
    }

    public static int fib(int n){
        if(lookup[n]==NIL){
            if(n<=1){
                lookup[n] = n;
            } else{
                lookup[n] = fib(n-1)+fib(n-2);
            }
        }
        return lookup[n];
    }


    /*
    Algorithm - 0/1 Knapsack problem
     */

    private static class Item implements Comparable<Item>{
        int value;
        int weight;

        public Item(int weight, int value){
            this.weight = weight;
            this.value = value;
        }
        @Override
        public int compareTo(Item o) {
            if (((double)(this.value/this.weight))>=((double)(o.value/o.weight))){
                return 1;
            } else{
                return -1;
            }
        }

    }

    private static void rearrange(List<Item> items){
        Collections.sort(items);
    }

    /*
    Total admissible weight is w.
    List of items items.
    The items cant be subdivided.
    Either choose the item in the solution or discard the item.
    Only one item is available to be used, there are no infinite list of items of a particular value.
    Find out the items that selected in the process using the method -- selectedItems using the dynamic 2D array.
     */
    public static void knapsack(List<Item> items, int w){
        rearrange(items);
        int s = items.size();
        int[] weights = new int[items.size()+1];
        int[] values = new int[items.size()+1];
        int i = 1;
        for(Item item:items){
            weights[i] = item.weight;
            values[i] = item.value;
            i++;
        }
        int[][] grid = new int[w+1][w+1];
        //Start the logic here
        for(int k=0;k<=w;k++){
            grid[0][k] = 0;
        }
        for(i =1;i<weights.length;i++){
            for(int j = 1;j<=w;j++){
                if(weights[i]>j){
                    grid[i][j] = grid[i-1][j];
                    System.out.print(grid[i][j]+ "\t");
                } else{
                    grid[i][j] = max(grid[i-1][j], grid[i-1][j-weights[i]]+values[i]);
                    System.out.print(grid[i][j]+ "\t");
                }
            }
            System.out.println();
        }
        List<Item> selectedItems = selectedItems(grid, items.size(), w, weights);
        for (Item item:selectedItems){
            System.out.print(item.weight);
        }

    }

    private static List<Item> selectedItems(int T[][], int w, int total, int[] weights){
        List<Item> selectedItems = new ArrayList<Item>();
        int i = w;
        int j = total;
        while(j!=0){
            if(T[i][j]==T[i-1][j]){
                i--;
            } else{
                selectedItems.add(new Item(weights[i],j));
                j = j-weights[i];
                i--;
            }
        }
        return selectedItems;
    }


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int N = Integer.parseInt(line);

        Scanner s = new Scanner(System.in);
        int edges = Integer.parseInt(s.nextLine());

        Set<Integer> vertices = null;
        for (int i = 0; i < N; i++) {
            vertices = new HashSet<Integer>();
            for(int j =0;j<edges;j++){
                String edgeParams = s.nextLine();
                StringTokenizer str = new StringTokenizer(edgeParams);
                int from = Integer.parseInt(str.nextToken());
                int to = Integer.parseInt(str.nextToken());
                vertices.add(from);
                vertices.add(to);
            }
            System.out.println(vertices.size());
        }
    }


    public static boolean number_divisible7(int num){
        return false;
    }

    public static int find(int[] arr, int n, int low, int high){
        if(high==low){
            if(arr[high] == n) return high;
            else return -1;
        } else {
            int mid = (high+low)/2;
            if(arr[mid]>n){
                return find(arr, n, low, mid);
            } else if(arr[mid]<n){
                return find(arr, n, mid+1, high);
            } else{
                return mid;
            }
        }
    }



}
