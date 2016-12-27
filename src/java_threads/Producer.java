package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class Producer implements Runnable {

    private Thread thread;
    private Q q;
    public Producer(Q q){
        this.q = q;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
