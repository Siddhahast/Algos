package classics;

/**
 * Created by siddhahastmohapatra on 19/01/17.
 *
 *
 * Larger element is at a higher index than the smaller element
 * the diff between larger and smaller is highest.
 *
 */
public class MaxDiffInArray {

    private static int a;
    private static int b;

    public static void main(String[] args) {
        int[] arr = {12, 11, 10, 6, 4, 8, 1};
        computeIndices(arr);
        System.out.print(a+ " ");
        System.out.print(b);
    }
    private static void computeIndices(int[] arr){

        int max_diff_found_so_far = 0;
        int min_Index = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[min_Index]){
                int diff = arr[i] - arr[min_Index];
                if(diff>max_diff_found_so_far){
                    max_diff_found_so_far = diff;
                    a = min_Index;
                    b = i;
                }
            } else{
                min_Index = i;
            }
        }

    }

}
