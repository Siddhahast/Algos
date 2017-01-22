package LiskovPrinciple;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class SchoolStaff {

    private void collectPaperWork(){
        System.out.println("do all the paper work");
    }

    private void takeAttendance(){
        System.out.println("take class attendance");
    }

    public void hallDuties(){
        System.out.println("perform hall duties");
    }


    public void performDuties(){
        collectPaperWork();
        takeAttendance();
        hallDuties();
    }

}
