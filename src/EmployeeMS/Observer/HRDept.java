package EmployeeMS.Observer;

import EmployeeMS.Entity.Employee;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class HRDept implements IObserver{

    @Override
    public void newEmployeeHired(Employee e) {
        System.out.println(" New Employee hired. HR dept notified - "+e.toString());
    }

    public void employeeNameChanged(Employee e){
        System.out.println("Employee Name changed. HR Notified - "+e.getName());
    }
}
