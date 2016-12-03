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

}
