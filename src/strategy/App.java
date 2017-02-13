package strategy;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class App {

    public static void main(String[] args) {
        StrategyHandler handler = new StrategyHandler(new DivisiveStrategy());
        handler.operate(11, 0);
    }


}
