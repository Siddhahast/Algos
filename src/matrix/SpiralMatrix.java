package matrix;

/**
 * Created by siddhahastmohapatra on 03/01/17.
 */
public class SpiralMatrix {

    public void displaySpiralMatrix(int[][] T, int left, int right, int floor, int ceiling) {
        while (left < right || floor > ceiling) {
            for (int i = left; i <= right; i++) {
                System.out.print(T[ceiling][i]+ " ");
            }
            ceiling++;
            for (int j = ceiling; j <= floor; j++) {
                System.out.print(T[j][right]+ " ");
            }
            right--;
            for (int k = right; k >= left; k--) {
                System.out.print(T[floor][k]+" ");
            }
            floor--;
            for (int m = floor; m >= ceiling; m--) {
                System.out.print(T[m][left]+ " ");
            }
            left++;
        }
    }
}
