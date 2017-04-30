package array_algos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by siddhahastmohapatra on 10/04/17.
 */

class Processor{

    private List<Integer> list = new ArrayList<Integer>();

    private Lock locker = new ReentrantLock(true);

    private final int BOTTOM = 0;

    private final int TOP = 5;

    private int value = 0;

    public void consume() throws InterruptedException{
		/*
			Lock is not acquired on this object,
			rather than on a third object or separate object.
		*/
        locker.lock();
        while(true)
        {
            if(list.size()==BOTTOM)
            {
                System.out.println("Waiting for adding items to the list ...");
                locker.unlock();
            } else
            {
                System.out.println("Removed : " + list.remove(--value));
            }
        Thread.sleep(1000);
        }

    }


    public void produce() throws InterruptedException{
        locker.lock();
        while(true)
        {
            if(list.size()==TOP)
            {
                System.out.println("Waiting to remove items ... ");
                locker.unlock();
            } else
            {
                System.out.println("Added : "+ list.add(value++));
            }
            Thread.sleep(1000);
        }
    }
}

public class App {
    public static void main(String[] args){

        Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }
}
