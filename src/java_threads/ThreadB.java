package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class ThreadB implements  Runnable{
    private A a;
    private B b;
    private Thread thread;

    public ThreadB(A a, B b){
        this.a = a;
        this.b = b;
        thread = new Thread(this, "ThreadB");
    }

    @Override
    public void run() {
        b.bar(a);
    }
}
