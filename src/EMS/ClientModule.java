package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class ClientModule {

    private static EmployeeDAO dao ;
    public static void main(String[] args) {
        dao = new EmployeeDAO();
        Employee e1 = new Employee(1, "siddhahast", "ops");
        Employee e2 = new Employee(2, "swayambhu", "janitor");
        Employee e3 = new Employee(3, "suman", "surgery");


    }

    private static void hireNewEmployee(Employee e){
        dao.addEmployee(e);
    }

    private static void terminateEmployee(Employee e){
        dao.deleteEmployee(e);
    }



}
