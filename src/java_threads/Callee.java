package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class Callee {

    public synchronized void receive(String message){

        System.out.print("["+message);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }

}
