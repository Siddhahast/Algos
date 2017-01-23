package LSP;

/**
 * Created by siddhahastmohapatra on 19/01/17.
 */
public class SchoolManagement {

    public void callUponInstructor(SchoolStaff staff){
        staff.performOtherDuties();
        CoarseInstructor instructor = new MathTeacher(staff.name, staff.id);
        instructor.teach();
    }

}
