package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class ConcreteFactory1 implements AbstractFactory {


    @Override
    public AbstractProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB1();
    }
}
