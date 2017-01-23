package HomeEntertainment;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class RemoteApp {

    public static void main(String[] args) {

        RemoteControl remoteControl = RemoteControl.getInstance();
        String deviceName = "Bose";
        remoteControl.selectDevice(DeviceType.Projector, deviceName);
        remoteControl.increaseVolume();
        remoteControl.decreaseVolume();

    }
}
