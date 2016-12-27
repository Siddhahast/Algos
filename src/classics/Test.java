package classics;
import java.util.Scanner;

/**
 * Created by siddhahastmohapatra on 18/11/16.
 */
public class Test {
    public static void main(String[] args) {

        int a = 0;
        System.out.print(a%7);
    }

    public static boolean testPalindrom(String input){
        int len = input.length();

        for(int i=0;i<len/2;i++){
            if(input.charAt(i) == input.charAt(len-1-i)){

            } else{
                return false;
            }
        }
        return true;
    }
}
