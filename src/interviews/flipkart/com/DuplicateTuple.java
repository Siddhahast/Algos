package interviews.flipkart.com;

/**
 * Created by siddhahastmohapatra on 28/12/16.
 */
public class DuplicateTuple extends Exception{

    private String message = "Duplicate tuple exception";

    public DuplicateTuple(){

    }

    public String getMessage(){
        return message;
    }

}
