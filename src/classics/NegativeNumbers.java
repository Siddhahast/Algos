package classics;

/**
 * Created by siddhahastmohapatra on 07/02/17.
 */
public class NegativeNumbers {

    /*
    Given a two dimensional array, need to count the number of negative numbers in it.
    Each row and column of the two dimensional array is sorted.
     */
    private static int negativeNumberCounts(int[][] T){
        int rows = T.length;
        int cols = T[0].length;
        int counts = 0;
        int j = 0;
        int i = 0;

        while(i<rows){
            while(j<cols){
                if(T[i][j]>0){
                    counts++;
                    j--;
                } else{
                    break;
                }
            }
            i++; j--;
        }
        return counts;
    }

    private static int T[][] = {{-3, -2, -1 , 0},
            {-1, 0 , 1 , 2}, {1, 3, 7, 8}, {4, 6, 8 , 9}};

    public static void main(String[] args) {

        System.out.println(negativeNumberCounts(T));

    }
}
