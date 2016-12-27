package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class Caller implements Runnable{

    private Callee target;
    private Thread thread;
    private String message;
    public Caller(String message, Callee callee){
        this.message = message;
        target = callee;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        target.receive(message);
    }

    public Thread getThread(){
        return thread;
    }
}
