package classics;

/**
 * Created by siddhahastmohapatra on 22/01/17.
 */
public class InversionOfArray {


    public static void main(String[] args) {

        int[] A = {2,4, 1,3,5};
        sort(A, 0, 4);
        for(int i: A){
            System.out.println(i);
        }
    }

    private void getInversions(int[] A){

        int inv = 0;



    }

    public static void sort(int[] A, int lo, int high){

        if(high == lo || (high-lo)==1){
            return;
        }

        int mid = (lo+high)/2;
        sort(A, lo, mid);
        sort(A, mid+1, high);
        merge(A, lo, mid+1, high);

    }

    public static void merge(int[] A, int lo, int mid, int high){

        int[] W = new int[A.length];
        for(int i=0;i<lo;i++){
            W[i] = A[i];
        }

        for(int j=high+1;j<A.length;j++){
            W[j] = A[j];
        }

        int k = mid;
        while(k<=high && lo<=mid){

            if(A[lo]>A[k]){
                int temp = A[k];
                A[k] = A[lo];
                A[lo] = temp;
                lo++;
            } else {
                k++;
            }

        }

        while(lo<=mid){
            lo++;
        }

        while(k<=high){
            k++;
        }

    }

}
