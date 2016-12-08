package java_threads;

/**
 * Created by siddhahastmohapatra on 07/12/16.
 *
 * Singleton Implementation for the
 */
public class Sequence {

    private static int serial_number;
    private static Sequence instance;
    public synchronized int get_serial_number(){
        notifyAll();
        return serial_number++;
    }

    private Sequence(){
        //Get the max value of the sequence from the db table.
        serial_number = 1;
    }

    public static synchronized Sequence getInstance(){
        if(instance == null){
            instance = new Sequence();
            return instance;
        } else{
            return instance;
        }
    }


}
