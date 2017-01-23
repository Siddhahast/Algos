package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class ChildrenCountsException extends Exception {

    private String message = "More than two children present";

    public ChildrenCountsException(){

    }

    public String getMessage(){
        return message;
    }
}
