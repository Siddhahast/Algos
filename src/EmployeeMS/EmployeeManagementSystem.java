package EmployeeMS;

import EmployeeMS.Entity.Employee;
import EmployeeMS.Entity.NotificationType;
import EmployeeMS.EntityDAO.EmployeeDAO;
import EmployeeMS.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class EmployeeManagementSystem {

    private List<IObserver> observers ;
    EmployeeDAO dao ;

    public EmployeeManagementSystem() {
        observers = new ArrayList<IObserver>();
        dao = new EmployeeDAO();
        dao.getAllEmployees();
    }

    public void registerObserver(IObserver observer){
        observers.add(observer);
    }

    public void addEmployee(Employee e){
        dao.addEmployee(e);
        notifyObservers(NotificationType.NEW_EMPLOYEE_HIRED, e);
    }

    public void modifyName(int id, String name){
        Employee e = dao.getAllEmployees().get(id-1);
        e.setName(name);
        notifyObservers(NotificationType.EMPLOYEE_NAME_MODIFIED, e);
    }

    private void notifyObservers(NotificationType type, Employee e){
        if(type == NotificationType.NEW_EMPLOYEE_HIRED){
            for(IObserver ob:observers){
                ob.newEmployeeHired(e);
            }
        } else if(type == NotificationType.EMPLOYEE_NAME_MODIFIED){
            for(IObserver ob:observers){
                ob.employeeNameChanged(e);
            }
        }
    }

}
