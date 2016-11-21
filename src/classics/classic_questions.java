package classics;

/**
 * Created by siddhahastmohapatra on 18/11/16.
 */
public class classic_questions {

    public static void rotate(int[] arr, int k){
        int[] it = new int[k];
        int i = 0;
        for(i = 0;i<k;i++){
            it[i] = arr[arr.length-k+i];
        }
        int j = 0;
        i = arr.length-k;
        while(i<arr.length){
            arr[i++] = arr[j++];
        }
        int m = 0;
        while(m < j){
            arr[m] = it[m];
            m++;
        }
    }

}
