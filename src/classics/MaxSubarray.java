package classics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by siddhahastmohapatra on 04/01/17.
 */
public class MaxSubarray {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){

            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[j] = Integer.parseInt(str.nextToken());
            }
            MinMax minMax = processArray(arr);
            System.out.println(minMax.csum + " "+ minMax.ncsum);

        }
    }

    private static MinMax processArray(int[] arr){
        int[] T = new int[arr.length];

        int j =0;
        int i = 1;

        int max = arr[0];
        int sum = arr[0];
        T[0] = max;
        int csum = arr[0];
        while(i<arr.length){
            if(arr[i]>0){
                sum = sum + arr[i];
            }
            if((T[i-1]+ arr[i])>0){
                csum =  csum + arr[i];
                T[i] = arr[i]+ T[i-1];
                if(max<T[i]){
                    max = T[i];
                }
            } else{
                T[i]= 0;
            }
            i++;
        }
        if(arr[0]<0 && csum>0){
            csum = csum - arr[0];
        }
        if(arr[0]<0 && sum>0){
            sum = sum - arr[0];
        }
        return new MinMax( max, sum);
    }


    private static int max(int a, int b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }

    private static class MinMax{
        int csum;
        int ncsum;

        public MinMax(int csum, int ncsum){
            this.csum = csum;
            this.ncsum = ncsum;
        }

    }
}
