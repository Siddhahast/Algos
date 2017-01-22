package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Fish extends Animal{

    public Fish(String name, String color, String sound){
        super(name, color, sound);
    }

    @Override
    public void move() {
        System.out.println("Fish swims...");
    }
}
