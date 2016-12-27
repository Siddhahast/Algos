package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class PCApp {

    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
    }
}
