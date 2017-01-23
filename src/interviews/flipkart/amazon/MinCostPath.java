package interviews.flipkart.amazon;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by siddhahastmohapatra on 12/01/17.
 */
public class MinCostPath {

    private static int minCostPath(int[][] A, int i, int j, int rows, int cols, int[][] T){

        if(i>=rows){
            return Integer.MAX_VALUE;
        }
        if(j>=cols){
            return Integer.MAX_VALUE;
        }

        if(i==rows-1 && j==cols-1){
            T[i][j] = A[i][j];
            return T[i][j];
        }
        return A[i][j] + min(minCostPath(A, i+1, j, rows, cols, T),
                minCostPath(A, i, j+1, rows, cols, T),
                minCostPath(A, i+1, j+1, rows, cols, T));
    }

    private static int min(int x, int y, int z){
        if(x>z && y>z){return z;}
        if(x>y && z>y){return y;}
        else{return x;}
    }

    public static void main(String[] args) {

        int[][] A = {{1,2,3}, {4,8,2}, {1,5,3}};
        int[][] T = new int[3][3];
        System.out.print(minCostPath(A, 0, 0, 3, 3, T));
        Queue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        q.peek();

    }
}
