package classics;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 22/01/17.
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        int[] A = {93, 28, 54, 12, 20 , 7, 27};
        int[] aux = nextGreaterElement(A);
        for(int i:aux){
            System.out.println(i);
        }

    }

    public static int[] nextGreaterElement(int[] A){
        int[] aux = new int[A.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for(int i=1;i<A.length;i++){

            if(A[stack.peek()]>A[i]){
                stack.push(i);
            } else{
                while(A[stack.peek()]<A[i] && !stack.isEmpty()){
                    aux[stack.pop()] = i;
                }
                stack.push(i);
            }
        }

        while(!stack.isEmpty()){
            aux[stack.pop()] = -1;
        }
        return aux;

    }

}
