package EmployeeMS.Client;

import EmployeeMS.EmployeeManagementSystem;
import EmployeeMS.Entity.Employee;
import EmployeeMS.Observer.HRDept;
import EmployeeMS.Observer.IObserver;
import EmployeeMS.Observer.PayRoll;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class App {

    public static void main(String[] args) {

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        IObserver hrObserver = new HRDept();
        IObserver payObserver = new PayRoll();

        ems.registerObserver(hrObserver);
        ems.registerObserver(payObserver);

        ems.addEmployee(new Employee("hitesh", "IT", true));
        ems.modifyName(5, "shane");

    }
}
