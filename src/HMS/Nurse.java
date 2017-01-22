package HMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Nurse extends Employee{
    private int id;
    private String name;
    private String dept;
    private boolean working;

    public Nurse(int id, String name, String dept, boolean working){
        super(id,name, dept, working);
    }

    private void drawBlodd(){
        System.out.println("drwaing blood of patient");
    }

    private void checkVitals(){
        System.out.println("checking vitals of patients");
    }

    private void cleanPatientArea(){
        System.out.println("claning patient area");
    }

    @Override
    public void performDuties() {
        checkVitals();
        drawBlodd();
        cleanPatientArea();
    }


}
