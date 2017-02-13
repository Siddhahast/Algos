package strategy;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class Multiplicative implements IStrategy {

    @Override
    public void operation(int num1, int num2) {
        System.out.println(num1*num2);
    }

}
