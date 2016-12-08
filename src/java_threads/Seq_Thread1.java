package java_threads;

/**
 * Created by siddhahastmohapatra on 07/12/16.
 */
public class Seq_Thread1 implements Runnable {

    private String thread_name = "First Thread";
    private Thread t ;
    private Sequence seq ;

    public Seq_Thread1(){
        this.seq = Sequence.getInstance();
        t = new Thread(this);
        t.start();
    }

    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println("Thread Name - "+ thread_name + " generates sequence - "
                    + seq.get_serial_number() + " , hashCode = "+ seq.hashCode());
            try {
                t.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
