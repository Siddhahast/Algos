package classics;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Stack;

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

    public static void main(String[] args) {
        int[] arr= {3,0,0,2,0,4};
        System.out.print(getWaterCapacity(arr));
    }


}
