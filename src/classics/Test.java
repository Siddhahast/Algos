package classics;

/**
 * Created by siddhahastmohapatra on 18/11/16.
 */
public class Test {
    public static void main(String[] args) {

        int n = 257;
        int[] bits = classic_questions.binary_representation(n);
        for(int b: bits){
            System.out.print(b);
        }
    }
}
