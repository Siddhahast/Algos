package matrix;

/**
 * Created by siddhahastmohapatra on 03/01/17.
 */
public class MatrixTest {

    public static void main(String[] args) {
        int[][] T = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        SpiralMatrix sp = new SpiralMatrix();
        sp.displaySpiralMatrix(T, 0, 3, 3, 0);
    }

}
