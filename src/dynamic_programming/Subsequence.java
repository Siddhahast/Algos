package dynamic_programming;

/**
 * Created by siddhahastmohapatra on 02/01/17.
 */
public class Subsequence {



    /*
    Get minimum value from a sorted/rotated array.
    Good quetsion on binary search for sorted elements in a liner ds.
     */
    private static void getMinimumRotatedIndex(int[] arr){
        int index = -1;
        index = getRotatedIndex(arr, 0, arr.length-1);
        if(index==arr.length-1){
            System.out.print("Minimum value in the array is :"+arr[0]);
        } else{
            System.out.print("Minimum value in the array is : "+arr[index]);
        }
    }

    private static int getRotatedIndex(int arr[], int lo, int hi){

        if(lo==hi || (hi-lo)==1){
            return hi;
        } else{
            int mid = (hi+lo)/2;
            if(arr[mid]>arr[lo]){
                return getRotatedIndex(arr, mid, hi);
            } else{
                return getRotatedIndex(arr, lo, mid);
            }
        }

    }

    private static void reach(int N){
        System.out.println(reachNthPoint(N));
    }

    private static int reachNthPoint(int N){
        int[] fib = new int[N+2];
        fib[0] = 0;
        fib[1] = 1;
        for(int m=2;m<=N+1;m++){
            fib[m] = fib[m-1]+fib[m-2];
        }
        return fib[N+1];
    }

    /*
    Core Logic:
        Create a separate array that contains the sum of all the incresing elements
            to that index.
            Choose i =1; j=0;
            Proceed the pointers in such a manner that whenever i == j,
                reset the j = 0 and increment j by 1.
            So, M[i] = max{M[i], M[j]+arr[i]};
     */
    private static int maxSubsequenceSum(int[] arr){

        int len = arr.length;
        int j = 0;
        int i = 1;

        int[] M = new int[len];
        for(int k =0;k<arr.length;k++){
            M[k] = arr[k];
        }

        while(i<len){
            if(i==j){
                i++;
                j = 0;
            } else {
                if (arr[j] < arr[i]) {
                    M[i] = max(M[i], M[j] + arr[i]);
                }
                j++;
            }
        }
        return maxElem(M);
    }

    private static int max(int a, int b){
        if(a>=b) return a;
        else return b;
    }

    private static int maxElem(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}
