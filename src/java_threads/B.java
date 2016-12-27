package java_threads;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class B {

    public synchronized void bar(A a){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " has captured B");

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.last();

    }

    public synchronized void last(){
        System.out.println("Inside B's last");
    }

}
