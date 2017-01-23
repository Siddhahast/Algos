package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Employee {

    int id;
    String name;
    String dept;
    boolean working;

    public Employee(int id, String name, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.working = true;
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

    public void fireEmployee(){
        this.working = false;
    }

}
