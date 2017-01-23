package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class ProductA1 extends AbstractProductA{

    private String name = "product-a1";

    public ProductA1(){
        super.name = name;
    }

    public String getName(){
        return name;
    }

}
