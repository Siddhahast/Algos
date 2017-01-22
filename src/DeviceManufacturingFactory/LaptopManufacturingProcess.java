package DeviceManufacturingFactory;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

    public LaptopManufacturingProcess(String processName){
        super(processName);
    }
    @Override
    public void assembly() {
        System.out.println("Assembly the laptop device");
    }

    @Override
    public void testing() {
        System.out.println("Testing the laptop device");
    }

    @Override
    public void packaging() {
        System.out.println("Packing the laptop device");
    }

    @Override
    public void storage() {
        System.out.println("Storing the laptop device");
    }
}