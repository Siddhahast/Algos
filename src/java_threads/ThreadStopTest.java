package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class ThreadStopTest {

    public static void main(String[] args) {
        T1 t1 = new T1("Thread 1 ");
        T1 t2 = new T1("Thread 2 ");

        try{
            Thread.sleep(1000);
            t1.suspendThread();
            System.out.println("Suspending thread 1");
            Thread.sleep(1000);
            t1.resumeThread();
            System.out.println("resuming thread 1");
            t2.suspendThread();
            Thread.sleep(1000);
            System.out.println("Suspending thread 2");
            t2.resumeThread();
            System.out.println("resuming thread 2");
        } catch (InterruptedException ex){

        }

        try{
            System.out.println("Waiting for all the other thread to finish");
            t1.getThread().join();
            t2.getThread().join();
        } catch(InterruptedException ex){

        }
        System.out.println("Ending main thread");

    }

}
