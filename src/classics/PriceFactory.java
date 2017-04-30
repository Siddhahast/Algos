package classics;

/**
 * Created by siddhahastmohapatra on 06/03/17.
 */
public class PriceFactory {

    public static Price getPrice(Currency currency){
        if(currency==Currency.INR){
            return new INR();
        }
        return null;
    }

}
