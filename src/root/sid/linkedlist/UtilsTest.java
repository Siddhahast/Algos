package root.sid.linkedlist;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Map;
/**
 * Created by siddhahast on 24/8/16.
 */
public class UtilsTest {

    public static void main(String[] args) {

    }

    public static int landingPosition(int[] input1,String[] input2)
    {
        int cols = input1[0];
        int rows = input1[1];
        char[][] T = new char[rows][cols];
        int i =0, j=0;
        for(String s: input2){
            int k = 0;
            j = 0;
            while(k<s.length()){
                T[i][j++] = s.charAt(k);
                k = k+2;
            }
            i++;
        }
        return helicopterSize(T, rows, cols);

    }


    private static int helicopterSize(char T[][], int rows, int cols){

        int max_size = 0;
        int S[][] = new int[rows][cols];
        int i = 0;
        for(i = 0;i<cols;i++){
            S[0][i] = (T[0][i]=='x'?0:1);
        }
        for(i =0 ;i<rows;i++){
            S[i][0] = (T[i][0]=='x'?0:1);
        }
        i = 1;
        int j = 1;
        for(i = 1;i<rows;i++){
            for(j = 1;j<cols;j++){
                if(T[i][j]=='o'){
                    int z = min(S[i-1][j], S[i-1][j-1], S[i][j-1]) + 1;
                    S[i][j] = z;
                    if(z>max_size){
                        max_size = z;
                    }
                } else{
                    S[i][j] = 0;
                }
            }

        }
        if(max_size == 0 || max_size == 1){
            return -1;
        } else{
            return max_size;
        }

    }

    private static int min(int a, int b, int c){
        int min = a;
        if(a<b){
            min = a;
        } else{
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
