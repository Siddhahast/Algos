package HMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public abstract class Employee {

    private int id;
    private String name;
    private String dept;
    private boolean working;

    public Employee(int id, String name, String dept, boolean working){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", working=" + working +
                '}';
    }

    public abstract void performDuties();


}
