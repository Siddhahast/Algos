package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class Client {

    public static void main(String[] args) {

        AbstractFactory factory1 = new ConcreteFactory1();

        AbstractFactory factory2 = new ConcreteFactory2();

        AbstractProduct product =  factory1.getProductA();
        System.out.println(product.getName());
    }
}
