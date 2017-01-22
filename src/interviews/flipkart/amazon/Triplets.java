package interviews.flipkart.amazon;
import java.io.*;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 12/01/17.
 */
public class Triplets {

    public static void main(String[] args) throws Exception{

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer str = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(str.nextToken());
//        int d = Integer.parseInt(str.nextToken());
//
//        int[] A = new int[N];
//        str = new StringTokenizer(br.readLine());
//
//        for(int i =0;i<N;i++){
//            A[i] = Integer.parseInt(str.nextToken());
//        }
        int[] B = {1,2,4,5, 7,8,10};
        System.out.println(triplets(B, 7, 3));
    }

    private static int triplets(int[] A, int N, int d){

        int[] max = new int[N];
        int[] min = new int[N];
        int j = A.length-1;

        int maxGlobal = j;
        int minGlobal = 0;
        min[minGlobal] = -1;
        max[maxGlobal] = -1;

        for(int i = 1;i<N;i++){
            if(A[i]<=A[minGlobal]){
                min[i] = -1;
                minGlobal = i;
            } else{
                min[i] = minGlobal;
            }
        }

        for(j=A.length-2;j>=0;j--){
            if(A[j]>=A[maxGlobal]){
                maxGlobal = j;
                max[j] = -1;
            } else{
                max[j] = maxGlobal;
            }
        }
        int counts = 0;

        for(int k = 0;k<N;k++){
            if(min[k]!=-1 && max[k]!=-1){
                int y = min[k];
                while(y<k){
                    int x = max[k];
                    while(x>k){
                        if(((A[k]-A[y])==d) && (A[x]-A[k])==d){
                            counts++;
                        }
                        x--;
                    }
                    y++;
                }
            }
        }
        return counts;
    }
}
