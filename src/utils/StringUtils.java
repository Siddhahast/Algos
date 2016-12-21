package utils;

/**
 * Created by siddhahastmohapatra on 21/10/16.
 */
public class StringUtils {

    public static void capitalizeString(String name){
        if(name== null){
            throw new NullPointerException();
        }
        char ch;
        int c = name.charAt(0);
        if(c>=97 && c<=122){
            c = c-32;
            ch = (char)c;
        }
        StringBuffer buffer = new StringBuffer(name);

    }

    public static int bruteForceMatching(String text, String pattern){
        int M = text.length();
        int N = pattern.length();
        for(int i=0;i<M;i++){
            int j;
            for(j=0;j<N;j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j == N)
                return i;
        }
        return N;//Not found.
    }

    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        System.out.println(KMPMatch(text, pattern));
    }

    /*
    Classic Algorithm of KMP Match.
    Steps to implement the algorithm :
    1. Create a kmp pattern for the subtext.
    2. Match the given input with the subtext.
    3. If there is a mismatch then start matching from the substring index by following back the substring start index as
        given the subtext pattern array.
     */

    public static int[] kmpPattern(String pattern){
        int pat[] = new int[pattern.length()];
        pat[0] = 0;

        int j = 0;
        int i = j+1;

        while(i<pattern.length()){
            if(pattern.charAt(i) != pattern.charAt(j)){
                if(j==0){
                    i++;
                } else{
                    j = pat[j-1];
                }
            } else {
                pat[i] = j+1;
                i++;
                j++;
            }

        }

        return pat;
    }

    public static int KMPMatch(String text, String pattern){

        int[] pat = kmpPattern(pattern);
        int i = 0;
        int j = i;
        while(i<text.length()){

            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            } else{
                if(j==0){
                    i++;
                } else{
                    j = pat[j-1];
                }
            }
            if(j==pattern.length()){
                return (i-j);
            }

        }
        return -1;
    }


}
