package classics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class MonkAzkaban {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> L = new ArrayList<Integer>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            L.add(Integer.parseInt(str.nextToken()));
        }
        computeSumArray(L);

    }

    private static void computeSumArray(List<Integer> A){

        int len = A.size();
        List<Integer> x = new ArrayList<Integer>(len);
        List<Integer> y = new ArrayList<Integer>(len);

        Stack<Integer> sx = new Stack<Integer>();
        Stack<Integer> sy = new Stack<Integer>();

        for(int i =0;i<len;i++){

            if(sx.isEmpty()){
                x.add(i, -1);
                sx.push(i);
            } else{

                while(!sx.isEmpty()){
                    if(A.get(i)<A.get(sx.peek())){
                        x.add(i, sx.peek()+1);
                        break;
                    } else{
                        sx.pop();
                        x.add(i, -1);
                    }
                }
                sx.push(i);
            }

        }

        for(int j =len-1;j>=0;j--){

            if(sy.isEmpty()){
                y.add(j, -1);
                y.add(j,-1);
                sy.push(j);
            } else{

                while(!sy.isEmpty()){
                    if(A.get(j)<A.get(sy.peek())){
                        y.add(j, sy.peek()+1);
                        break;
                    } else{
                        sy.pop();
                        y.add(j, -1);
                    }
                }
                sy.push(j);
            }

        }

        for(int m=0;m<A.size();m++){
            System.out.print((x.get(m)+y.get(m)) + " ");
        }
        System.out.println();

    }

}
