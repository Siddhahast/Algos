package classics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by siddhahastmohapatra on 03/01/17.
 */
public class Anagrams {

    private static int NUMBERS = 26;

    public static int difference(int[] charCounts1, int[] charCounts2){
        if(charCounts1.length!=charCounts2.length){
            return -1;
        }
        int diff = 0;
        for(int i=0;i<charCounts1.length;i++){
            int d = Math.abs(charCounts1[i] - charCounts2[i]);
            diff = diff + d;
        }
        return diff;
    }

    public static int[] createCharCounts(String input){

        int[] charCounts = new int[NUMBERS];
        int boundary = (int) 'a';
        for(int i=0;i<input.length();i++){
            int code = (int) input.charAt(i) - boundary;
            charCounts[code]++;
        }
        return charCounts;
    }

    public static int anagramDifference(String input1, String input2){

        int[] charCounts1 = createCharCounts(input1);
        int[] charCounts2 = createCharCounts(input2);

        int diff = difference(charCounts1, charCounts2);
        return diff;
    }
    private void createAnagrams(char[] c, int i){

        if(i==c.length-1){
            System.out.println(c);
        } else{
            for(int j = i;j<c.length;j++){
                swap(c, i, j);
                createAnagrams(c, i+1);
                swap(c, j, i);
            }
        }

    }

    private void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    private static void checkNums(){
        String n = "I am 28 years old";
        StringTokenizer str = new StringTokenizer(n);

        while(str.hasMoreElements()){
            String s = str.nextToken();
            if(Integer.valueOf(s) instanceof Number){

            }
        }

    }

    private static void listSubSequences(String number){

        boolean A[] = new boolean[number.length()];
        char[] C = new char[number.length()];
        for(int i=0;i<number.length();i++){
            C[i] = Character.valueOf(number.charAt(i));
        }
        List<Integer> numbers = new ArrayList<Integer>();
        combinations(A, C, 0, C.length, numbers);
        System.out.print(numbers.size());
    }

    private static void combinations(boolean[]A, char[]C,  int k, int n, List<Integer> numbers){
        if(k==n-1){
            A[k]= false;
            int num = getNumber(A, C, n);
            if(num==0){

            } else{
                if(num%8==0){
                    numbers.add(num);
                }
            }
            A[k] = true;
            num = getNumber(A, C, n);
            if(num==0){

            } else{
                if(num%8==0){
                    numbers.add(num);
                }
            }
            return;
        } else{
            A[k] = false;
            combinations(A, C, k+1, n, numbers);
            A[k] = true;
            combinations(A, C, k+1, n, numbers);
        }
    }

    private static int getNumber(boolean[] A, char[] C, int n){
        int sum = 0;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            if(A[i]==true){
                sum++;
                sb.append(C[i]);
            }
        }
        if(sum==0){
            return 0;
        } else{
            return Integer.valueOf(new String(sb));
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        listSubSequences(input);

    }


    private static void combination(int[] A, int k, int N){

        if(k==N-1){
            A[k]= 0;
            //print
            A[k] = 1;
            //print
            return;
        }
        A[k] = 0;
        combination(A, k+1, N);
        A[k] = 1;
        combination(A, k+1, N);

    }

}
