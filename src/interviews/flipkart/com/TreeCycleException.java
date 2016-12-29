package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class TreeCycleException extends Exception {

    private String message = "Cycle in the tree detected";

    public TreeCycleException(){
    }

    public String getMessage(){
        return message;
    }
}
