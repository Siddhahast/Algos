package strategy;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class Additive implements IStrategy {

    @Override
    public void operation(int num1, int num2) {
        System.out.print(num1+ num2);
    }

}
