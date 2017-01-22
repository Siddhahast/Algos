package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Sparrow extends Bird implements Flyable{
    public Sparrow(String name, String color, String sound) {
        super(name, color, sound);
    }

    @Override
    public void fly() {
        super.move();
        System.out.println("Flying...");
    }
}
