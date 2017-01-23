package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Nurse extends Employee {

    private int id;
    private String name;
    private String dept;
    boolean working;

    public Nurse(int id, String name, String dept){
        super(id, name, dept);
    }

    public void checkVitals(){
        System.out.println("Nurse checking vitals");
    }

}
