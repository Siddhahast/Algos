package LSP;

/**
 * Created by siddhahastmohapatra on 19/01/17.
 */
public abstract class SchoolStaff {

    protected String name;
    protected int id;

    public SchoolStaff(String name, int id){
        this.name = name;
        this.id = id;
    }

    private void attendance(){
        System.out.println("Taking attendance of the class");
    }

    private void announcements(){
        System.out.println("Important announcements to be done");
    }

    private void conductPaperWorks(){
        System.out.println("Do all the related paper works");
    }

    public void performOtherDuties(){
        attendance();
        announcements();
        conductPaperWorks();
    }

}
