package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Earth {

    public static void main(String[] args) {

        Human siddhahast = new Human("siddhahast");
        siddhahast.heightInInches = 75;
        siddhahast.age = 28;
        siddhahast.eyeColor = "black";
        siddhahast.speak();

        Human suman = new Human("suman");
        suman.eyeColor = "black";
        suman.heightInInches = 70;
        suman.age = 27;
        suman.speak();

    }

}
