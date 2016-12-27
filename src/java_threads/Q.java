package java_threads;

/**
 * Created by siddhahastmohapatra on 27/12/16.
 */
public class Q {

    private int n;
    private boolean valueSet = false;

    public synchronized void put(int n){

        while(valueSet){
            try{
                wait();
            } catch (InterruptedException e ){

            }
        }
        this.valueSet = true;
        this.n = n;
        System.out.println("Put : " +n);
        notify();
    }

    public synchronized int get(){

        while(!valueSet){
            try{
                wait();
            } catch(InterruptedException e){

            }
        }
        System.out.println("Got : "+n);
        this.valueSet = false;
        notify();
        return n;
    }

}
