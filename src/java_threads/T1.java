package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class T1 implements Runnable {

    private Thread thread;
    private boolean suspendFlag;
    private String threadName;
    public T1(){
        this.suspendFlag = false;
        thread = new Thread(this, "T1");
        thread.start();
    }

    public T1(String name){
        this.threadName = name;
        this.suspendFlag = false;
        thread = new Thread(this, threadName);
        thread.start();
    }


    public Thread getThread(){
        return thread;
    }

    @Override
    public void run() {
        for (int i = 1;i<=15;i++){
            System.out.println(thread.getName() +" : " +i);
            try{
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            } catch (InterruptedException e){

            }
        }
        System.out.print("Finised "+ thread.getName());
    }

    public synchronized void resumeThread(){
        this.suspendFlag = false;
        notifyAll();
    }

    public synchronized void suspendThread(){
        suspendFlag = true;
    }

}
