package strategy;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class StrategyHandler {

    private IStrategy strategy;

    public StrategyHandler(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(int num1, int num2){
        strategy.operation(num1, num2);
    }

}
