package LiskovPrinciple;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class EnglishTeacher extends SchoolStaff implements CoarseInstructor{

    @Override
    public void teach() {
        System.out.print("teach english");
    }
}
