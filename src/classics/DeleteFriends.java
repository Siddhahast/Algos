package classics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by siddhahastmohapatra on 03/01/17.
 */
public class DeleteFriends {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(str.nextToken());
            int del = Integer.parseInt(str.nextToken());
            int[] arr = new int[f];
            str = new StringTokenizer(br.readLine());
            for(int j=0;j<f;j++){
                arr[j] = Integer.parseInt(str.nextToken());
            }
            displayFriends(deleteFriends(arr, f, del));
        }

    }

    public static Stack<Integer> deleteFriends(int[] arr, int len, int del){

        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> s = new Stack<Integer>();

        int k = 0;
        int j = 0;
        while(k<del && j<len-1){
            if(arr[j]<arr[j+1]){
                k++;
            } else{
                s.push(arr[j]);
            }
            j++;
        }
        while(j<len){
            s.push(arr[j]);
            j++;
        }
        s = enqueFromStack(s);
        while(k<del){
            s.pop();
            k++;
        }

        return s;
    }

    private static Stack<Integer> enqueFromStack(Stack<Integer> stack){
        Stack<Integer> n = new Stack<Integer>();
        while(!stack.isEmpty()){
            n.push(stack.pop());
        }
        return n;
    }

    public static void displayFriends(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+ " ");
        }
    }

}
