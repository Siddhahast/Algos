package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class App {

    public static void main(String[] args) {

        Callee callee = new Callee();
        Caller caller1 = new Caller("Hello", callee);
        Caller caller2 = new Caller("Synchronized", callee);
        Caller caller3 = new Caller("World", callee);

        try {
            caller1.getThread().join();
            caller2.getThread().join();
            caller3.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
