package strategy;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class DivisiveStrategy implements IStrategy{

    @Override
    public void operation(int num1, int num2) {
        try{
            System.out.println(num1/num2);
        } catch (ArithmeticException ae){
            System.out.print("Diving by zero");
        }
    }
}
