package classics;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 10/01/17.
 */
public class LargestAreaHistogram {

    public static void main(String[] args) {

        LargestAreaHistogram h = new LargestAreaHistogram();
        int[] A = {6, 2, 5, 4, 5, 2, 6};
        System.out.print(h.getMaxArea(A));

    }

    public int getMaxArea(int[] A){

        Stack<Integer> stack = new Stack<Integer>();
        int max_area = 0;
        int i = 0;
        int n = A.length;

        while(i<n){
            if(stack.isEmpty() || A[i]<=A[stack.peek()]) {
                stack.push(i++);
            } else{
                int peek = stack.peek();
                stack.pop();

                int area_with_top = A[peek] * (stack.isEmpty()?i:i-stack.peek()-1);
                if(max_area<area_with_top){
                    max_area = area_with_top;
                }
            }
        }

        while(!stack.isEmpty()){
            int peek = stack.peek();
            stack.pop();

            int area_with_top = A[peek]*(stack.isEmpty()?i:i-stack.peek()-1);
            if(area_with_top>max_area){
                max_area = area_with_top;
            }
        }
        return max_area;
    }


}
