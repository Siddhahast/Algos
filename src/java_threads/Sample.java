package java_threads;

/**
 * Created by siddhahastmohapatra on 29/12/16.
 */
public class Sample extends Thread {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.run();
    }

    public void run(){
        for(int i=1;i<=3;i++){
            System.out.print(i+"..");
        }
    }

}
