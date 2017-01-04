package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB2();
    }
}
