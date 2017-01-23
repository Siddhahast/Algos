package HomeEntertainment;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class TV extends Device {

    String name;

    public TV(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void increaseVolume() {
        System.out.println(name + " -- Increasing volume ...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println(name + " -- Decreasing volume ...");
    }

}
