package LSP;

/**
 * Created by siddhahastmohapatra on 19/01/17.
 */
public class MathTeacher extends SchoolStaff implements CoarseInstructor {

    public MathTeacher(String name, int id){
        super(name, id);
    }

    @Override
    public void teach() {
        System.out.println("Teach mathematics to students");
    }

}
