package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class User {

    private int id;
    private String name;
    private int vendor_id;
    private int facility_id;
    private String facility_code;
    private String userRole;

    public User(int id, String name, String role, String facility_code, int vendor_id, int facility_id){

        this.name = name;
        this.userRole = role;
        this.facility_code = facility_code;
        this.vendor_id = vendor_id;
        this.facility_id = facility_id;

    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getVendor_id(){
        return vendor_id;
    }

    public int getFacility_id(){
        return facility_id;
    }

    public String getUserRole(){
        return userRole;
    }

}
