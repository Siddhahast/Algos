package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Chicken extends Bird implements Flyable{


    public Chicken(String name, String color, String sound) {
        super(name, color, sound);
    }

    @Override
    public void fly() {
        System.out.print("not able to fly");
    }
}
