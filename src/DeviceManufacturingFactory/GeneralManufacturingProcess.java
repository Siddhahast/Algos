package DeviceManufacturingFactory;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String processName){
        this.processName = processName;
    }

    protected abstract void assembly();
    protected abstract void testing();
    protected abstract void packaging();
    protected abstract void storage();

    /*
    Template method.
    This method defines the processes to be performed inside the method in
    a systematic manner.

    This type of design pattern is used to design the WORKFLOWS.

    We defined the generic flow without getting into the implementation details.
     */
    public void manufactureDevice(){
        if(processName ==null){
            System.out.println("No process selected");
        } else{
            assembly();
            testing();
            packaging();
            storage();
        }
    }


}
