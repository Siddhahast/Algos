package HomeEntertainment;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public abstract class Device {

    private String name;

    public Device(String name){
        this.name = name;
    }

    public abstract void increaseVolume();

    public abstract void decreaseVolume();

}
