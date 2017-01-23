package LiskovPrinciple;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class MathTeacher extends SchoolStaff implements CoarseInstructor{

    @Override
    public void teach() {
        System.out.println("teach maths");
    }

}
