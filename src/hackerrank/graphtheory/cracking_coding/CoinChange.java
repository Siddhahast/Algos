package hackerrank.graphtheory.cracking_coding;
import java.io.*;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 09/01/17.
 */
public class CoinChange {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(str.nextToken());
        int N = Integer.parseInt(str.nextToken());
        int[] A = new int[N];
        str = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            A[i] = Integer.parseInt(str.nextToken());
        }
        System.out.println(coinChanges(A, S));

    }

    private static int coinChanges(int[] A, int S){
        int[] N = new int[A.length+1];
        for(int k =0;k<A.length;k++){
            N[k+1] = A[k];
        }
        int[][] T = new int[A.length+1][S+1];
        for(int i = 1;i<=A.length;i++){
            for(int j=1;j<=S;j++){

                if(j<N[i]){
                    T[i][j] = T[i-1][j];
                } else {
                    if(j%N[i]==0 && j==N[i]){
                        T[i][j] = T[i-1][j]+ 1;
                    } else if(j%N[i]==0){
                        T[i][j] = T[i-1][j] + T[i][j-N[i]];
                    } else{
                        T[i][j] = T[i-1][j] + T[i][j-N[i]];
                    }
                }

            }
        }
        return T[A.length][S];
    }
}
