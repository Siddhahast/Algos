package DeviceManufacturingFactory;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Factory {

    public static void main(String[] args) {
        String processName = "LAPTOP";
        DeviceType type = DeviceType.LAPTOP;
        GeneralManufacturingProcess process = null;
        if(type == DeviceType.MOBILE){
            process = new MobileManufacturingProcess(processName);
        } else{
            process = new LaptopManufacturingProcess(processName);
        }
        process.manufactureDevice();
    }

}
