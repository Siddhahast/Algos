package classics;

/**
 * Created by siddhahastmohapatra on 06/03/17.
 */
public class Product{

    private String pName;
    private String brand;

    private Price price;

    public int getProductPrice(){
        return price.getAmount();
    }

    public void setCurrency(Currency currency){
        this.price = PriceFactory.getPrice(currency);
    }

}
