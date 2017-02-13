package classics;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class PowerCalculator {

    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        System.out.print(power(a, b));

    }

    private static int power(int a, int b){

        if(b==0){
            return 1;
        }

        if(b ==1){
            return a;
        }

        return a * power(a, b-1);

    }

}
