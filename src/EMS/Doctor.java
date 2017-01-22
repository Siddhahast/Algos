package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Doctor extends Employee {

    private int id;
    private String name;
    private String dept;
    boolean working;

    public Doctor(int id, String name, String dept){
        super(id, name, dept);
    }

    public void diagnose(){
        System.out.print("diagnose a patient");
    }
}
