package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class TThreadsTest {

    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        for (int i = 1;i<=15;i++){
            System.out.print(Thread.currentThread().getName() +" : " +i);
            try{
                Thread.sleep(200);
            } catch (InterruptedException e){

            }
        }
        try{
            t1.getThread().join();
            t2.getThread().join();

            System.out.print("Finised "+ Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
