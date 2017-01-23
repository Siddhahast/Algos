package HomeEntertainment;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class SoundSystem extends Device {

    private String name;

    public SoundSystem(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void increaseVolume() {
        System.out.println(name + " -- increasing volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.print(name + " -- decreasing volume");
    }
}
