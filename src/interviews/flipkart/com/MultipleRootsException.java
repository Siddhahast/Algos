package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class MultipleRootsException extends Exception{

    private String message = "Multiple roots exist in the tree";
    public MultipleRootsException(){

    }

    public String getMessage(){
        return message;
    }

}
