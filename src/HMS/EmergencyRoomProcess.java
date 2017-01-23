package HMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class EmergencyRoomProcess {

    public static void main(String[] args) {

        Employee peggy = new Nurse(1, "peggy", "emergency", true);

        HospitalManagement management = new HospitalManagement();
        management.callUpon(peggy);

        Employee suzan = new Doctor(2, "suzan", "emergency", true);
        management.callUpon(suzan);

    }

}
