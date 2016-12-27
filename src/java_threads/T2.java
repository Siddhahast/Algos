package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class T2 implements Runnable {

    private Thread thread;

    public T2 (){
        thread = new Thread(this, "T2");
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
            } catch (InterruptedException e){

            }
        }
        System.out.print("Finised "+ thread.getName());
    }
}
