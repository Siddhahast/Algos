package classics;

/**
 * Created by siddhahastmohapatra on 08/02/17.
 */
public class NextGreaterNumber {

    public static void main(String[] args) {
        int[] N = {4,0,2,1};
        nextGreaterNumber(N);
    }

    private static void nextGreaterNumber(int[] N){

        int i = N.length-1;
        while(i>0){
            if(N[i-1]>=N[i]){
                i--;
            } else{
                swap(i, i-1, N);
                break;
            }
        }
        if(i==0){
            print(N);
            return;
        }

        int j = N.length-1;
        i--;
        while(j>i){
            if(N[j-1]>N[j]){
                swap(j-1, j+1, N);
            } else{
                j--;
            }
        }
        print(N);
    }

    private static void swap(int i, int j, int[] N){
        int temp = N[i];
        N[i] = N[j];
        N[j] = temp;
    }

    private static void print(int[] N){
        for(int i: N){
            System.out.print(i);
        }
        System.out.println();
    }

}
