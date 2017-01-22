package HomeEntertainment;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class RemoteControl {

    private Device device;

    private static RemoteControl instance = new RemoteControl();

    private RemoteControl(){

    }

    public static RemoteControl getInstance(){
        return instance;
    }

    public void selectDevice(DeviceType deviceType, String deviceName){
        switch (deviceType){
            case TV:
                device = new TV(deviceName);
                break;
            case Projector:
                device = new Projector(deviceName);
                break;
            case SoundSystem:
                device = new SoundSystem(deviceName);
                break;
        }
    }

    public void increaseVolume(){
        device.increaseVolume();
    }

    public void decreaseVolume(){
        device.decreaseVolume();
    }

}
