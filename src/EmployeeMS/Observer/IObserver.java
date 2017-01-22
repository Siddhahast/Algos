package EmployeeMS.Observer;

import EmployeeMS.Entity.Employee;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public interface IObserver {

    public void newEmployeeHired(Employee e);

    public void employeeNameChanged(Employee e);


}
