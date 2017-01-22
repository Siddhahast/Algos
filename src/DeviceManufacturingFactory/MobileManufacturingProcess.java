package DeviceManufacturingFactory;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class MobileManufacturingProcess extends GeneralManufacturingProcess {

    public MobileManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    public void assembly() {
        System.out.println("Assembly the mobile device");
    }

    @Override
    public void testing() {
        System.out.println("Testing the mobile device");
    }

    @Override
    public void packaging() {
        System.out.println("Packing the mobile device");
    }

    @Override
    public void storage() {
        System.out.println("Storing the mobile device");
    }
}
