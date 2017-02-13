package classics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 24/01/17.
 */
public class MissingNumberDuplicateArray {

    public static void main(String[] args) {
        int[] A = {9, 7, 8, 5, 4, 6, 2, 3, 1};
        int[] B = {2, 4, 3, 9, 1, 8, 5, 6};
        System.out.println(getMissingNumber(A, B));
        List<Integer> list = new ArrayList<Integer>(7);

    }

    private static int getMissingNumber(int[] A, int[] B){

        int sum = 0;
        for (int i=0;i<A.length;i++){
            sum = sum + A[i];
        }

        for (int j=0;j<B.length;j++){
            sum = sum -B[j];
        }

        return sum;
    }

}
