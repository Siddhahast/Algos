package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public abstract class Animal {

    String name;
    String color;
    int legs;
    String sound;

    public Animal(String name, String color, String sounds){
        super();
        this.name = name;
        this.color = color;
        this.sound = sounds;
    }

    public void sleep(){
        System.out.println("sleeping...");
    }

    public void makeNoise(){
        System.out.println("noise..."+ sound);
    }

    public abstract void move();
}
