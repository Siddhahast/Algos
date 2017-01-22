package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class EmployeeDAO {

    public void addEmployee(Employee emp){
        DatabaseConnectionManager manager = DatabaseConnectionManager.getConnectionInstance();
        try{
            manager.connect();
            manager.getConnectionObject().prepareStatement("insert into employee(employee_name, working, dept) values(?,?,?)");

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void deleteEmployee(Employee emp){
        System.out.println("deleted employee "+emp.toString());
    }

}
