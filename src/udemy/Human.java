package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println("Hello! My name is "+ name);
        System.out.println("My height is "+ heightInInches+ " with eye color "+ eyeColor + " and "+age+ " years old ");
    }

    public void eat(){
        System.out.println("eating..");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }

}
