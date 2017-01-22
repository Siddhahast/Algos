package classics;
import java.io.*;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 08/01/17.
 */
public class BuyFlowers {

    public static void main(String[] args) throws Exception{

        Queue<Integer> max = new PriorityQueue<Integer>(
                new Comparator<Integer>(){
                    public int compare(Integer i1 , Integer i2){
                        return -1*i1.compareTo(i2);
                    }
                }
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(br.readLine());
        for(int i = 0;i<N; i++){
            max.add(Integer.parseInt(str.nextToken()));
        }
        System.out.println(getMinimumAmountPaid(max, K));

    }

    private static int getMinimumAmountPaid(Queue<Integer> max, int friends){
        Queue<Integer> min = new PriorityQueue<Integer>(friends);
        int loops = (max.size()/friends)+1;
        int j = 1;
        int l = 1;
        while(!max.isEmpty() && l<=loops){
            int i = l*max.poll();
            if(l==1){
                min.add(i);
            } else{
                i = i+min.poll();
                min.add(i);
            }
            if((j%friends)==0){
                j = 1;
                l++;
            } else{
                j++;
            }

        }
        int sum = 0;
        while(!min.isEmpty()){
            sum = sum + min.poll();
        }
        return sum;
    }
}
