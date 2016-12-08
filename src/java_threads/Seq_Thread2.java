package java_threads;

/**
 * Created by siddhahastmohapatra on 07/12/16.
 */
public class Seq_Thread2 implements Runnable {

    private Thread t;
    private Sequence seq;
    private String thread_name;

    public Seq_Thread2(){
        this.seq = Sequence.getInstance();
        t = new Thread(this);
        this.thread_name = "Second Thread";
        t.start();
    }

    public void run(){
        for (int i = 0; i< 10; i++){
            System.out.println("Thread Name - "+ thread_name + " generates sequence - "+
                    seq.get_serial_number()+ " , hashCode = "+seq.hashCode());
            try {
                t.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
