package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Bird extends Animal{

    public Bird(String name, String color, String sound){
        super(name, color, sound);
    }

    public void move(){
        System.out.println("Flapping wings...");
    }

}
