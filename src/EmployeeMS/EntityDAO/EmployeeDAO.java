package EmployeeMS.EntityDAO;

import EmployeeMS.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class EmployeeDAO {

    Employee e1 = new Employee("siddhahast", "IT", true);
    Employee e2 = new Employee("pinty", "IT", true);
    Employee e3 = new Employee("mohapatra", "IT", true);
    Employee e4 = new Employee("sherlok", "HR", true);
    Employee e5 = new Employee("watson", "PAY", true);
    Employee e6 = new Employee("irene", "HR", true);

    private List<Employee> employees;

    public EmployeeDAO(){
        employees = new ArrayList<Employee>();
        getAllEmployees();
    }

    public List<Employee> getAllEmployees(){
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        return employees;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

}
