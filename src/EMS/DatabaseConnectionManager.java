package EMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class DatabaseConnectionManager {

    //Singleton instance for this object as there should one db connection object for this entire application

    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    public DatabaseConnectionManager(){

    }

    public static DatabaseConnectionManager getConnectionInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException{
        conn = DriverManager.getConnection("Some url");
        System.out.println("Connecting to the remote database");
    }

    public Connection getConnectionObject(){
        return conn;
    }
}
