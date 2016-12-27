package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class A {

    public synchronized void foo(B b){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " has captured A's monitor");

        try{
            Thread.sleep(1);
        } catch (InterruptedException e){

        }
        b.last();

    }

    public synchronized void last(){
        System.out.println("Inside A's last");
    }

}
