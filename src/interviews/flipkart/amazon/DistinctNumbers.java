package interviews.flipkart.amazon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by siddhahastmohapatra on 12/01/17.
 */
public class DistinctNumbers {

    private static int[] getDisinctNumbers(int[] A, int N){
        int j = 0;
        int[] nums = new int[2];
        Set<Integer>  set = new HashSet<Integer>();

        for(int i:A){

            if(!set.contains(i)){
                set.add(i);
            } else{
                set.remove(i);
            }

        }

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            nums[j++] = it.next();
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) throws Exception{
        int[] A = {100,2,100,2,100};
        System.out.println(getMaxCost(A));
    }

    private static int getMaxCost(int[] A){
        int n = A.length;
        int cost = 0;
        for(int i=1;i<n;i++){
            cost = cost + (int) (Math.abs(A[i]-A[i-1]));
        }
        return cost;
    }
}
