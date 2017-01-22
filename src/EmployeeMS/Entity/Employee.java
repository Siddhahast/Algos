package EmployeeMS.Entity;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Employee {

    private int id;
    private String name;
    private String dept;
    private boolean working;

    private static int counts = 0;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", working=" + working +
                '}';
    }

    public Employee(String name, String dept, boolean working){
        this.name = name;
        this.dept = dept;
        this.working = true;
        this.id = ++counts;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
