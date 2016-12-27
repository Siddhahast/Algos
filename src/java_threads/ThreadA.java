package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class ThreadA implements Runnable {

    private Thread thread;
    private A a;
    private B b;

    public ThreadA(A a, B b){
        this.a = a;
        this.b = b;
        thread = new Thread(this, "ThreadA");
        thread.start();
    }

    @Override
    public void run() {
        a.foo(b);
    }
}
