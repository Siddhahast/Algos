package classics;

/**
 * Created by siddhahastmohapatra on 15/01/17.
 */
public class BinomialCoff {

    public int binomialCoff(int n, int k){
        int numerator = factorial(n);
        int den = factorial(n-k)*factorial(k);

        return numerator/den;
    }

    private int factorial(int n){
        if(n==1 || n == 0){
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }

}
