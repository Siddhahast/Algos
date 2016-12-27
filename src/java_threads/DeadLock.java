package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class DeadLock {

    public DeadLock(){
        A a = new A();
        B b = new B();
        ThreadA threadA = new ThreadA(a, b);
        ThreadB threadB = new ThreadB(a, b);
    }

    public static void main(String[] args) {
        new DeadLock();
    }

}
