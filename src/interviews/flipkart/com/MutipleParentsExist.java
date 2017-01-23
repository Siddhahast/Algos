package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class MutipleParentsExist extends Exception {

    private String message = "Multiple parents exist in the tree at the node";

    public String getMessage(){
        return message;
    }

    public MutipleParentsExist(){}

}
