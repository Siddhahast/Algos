package classics;

/**
 * Created by siddhahastmohapatra on 18/11/16.
 */
public class Test {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        classic_questions c = new classic_questions();
        c.rotate(a, 1);

        for(int i:a){
            System.out.println(i);
        }
    }
}
