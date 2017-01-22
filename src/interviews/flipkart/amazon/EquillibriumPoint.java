package interviews.flipkart.amazon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by siddhahastmohapatra on 12/01/17.
 */
public class EquillibriumPoint {

    private static int equilibriumIndex(int[] A){
        int left = 0;
        int right = A.length-1;

        int sumLeft = A[left];
        int sumRight = A[right];
        left++;
        right--;
        while(left<=right){

            if(sumLeft>sumRight){
                sumRight = sumRight + A[right--];
            }

            if(sumLeft<sumRight){
                sumLeft = sumLeft + A[left++];
            }

            if(sumLeft==sumRight){
                return left;
            }
        }

        if(sumLeft == sumRight){
            return left;
        }
        return -1;

    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i =0;i<T;i++){
            int size = Integer.parseInt(br.readLine());
            int[] A = new int[size];
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j=0;j<size;j++){
                A[j] = Integer.parseInt(str.nextToken());
            }
            System.out.println(equilibriumIndex(A));
        }
    }

}
