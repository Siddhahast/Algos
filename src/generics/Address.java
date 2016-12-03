package generics;

/**
 * Created by siddhahastmohapatra on 26/11/16.
 */
public class Address implements Item {

    private String flat;
    private String appartment;
    private String pincode;

    public Address(String flat, String appartment, String pincode){
        this.flat = flat;
        this.appartment = appartment;
        this.pincode = pincode;
    }

    public String toString(){
        return flat+ " , "+ appartment+ " , "+ pincode;
    }


}
