package EmployeeMS.Observer;

import EmployeeMS.Entity.Employee;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class PayRoll implements IObserver {

    @Override
    public void employeeNameChanged(Employee e) {
        System.out.println("Name changed: PAYROLL NOTIFIED .."+ e.getName());
    }

    public void newEmployeeHired(Employee e){
        System.out.println("New employee hired: PAYROLL Notified - "+ e.toString());

    }
}
