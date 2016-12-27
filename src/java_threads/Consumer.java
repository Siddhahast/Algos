package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class Consumer implements Runnable {

    private Q q;
    private Thread thread;
    public Consumer(Q q){
        this.q = q;
        this.thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

        while(true){
            q.get();
        }

    }
}
