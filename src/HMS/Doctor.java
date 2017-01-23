package HMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Doctor extends Employee {

    private int id;
    private String name;
    private String dept;
    private boolean working;

    public Doctor(int id, String name, String dept, boolean working){
        super(id, name, dept, working);
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    private void diagnose(){
        System.out.println("doctor" + name + " diagnosing patient");
    }

    private void prescribeMedicine(){
        System.out.println(name + " is prescribing medicines");
    }

    @Override
    public void performDuties() {
        diagnose();
        prescribeMedicine();
    }


}
