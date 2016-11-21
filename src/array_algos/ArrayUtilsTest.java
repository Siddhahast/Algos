package array_algos;

/**
 * Created by siddhahastmohapatra on 20/11/16.
 */
public class ArrayUtilsTest {

    public static void main(String[] args) {
        int[] arr = {11,14,9,1,5, 90,13};
        arr = ArrayUtils.merge_sort(arr);

        for(int i: arr){
            System.out.println(i);
        }
    }

}
