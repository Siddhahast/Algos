package udemy;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class Zoo {

    public static void main(String[] args) {

        Animal sparrow = new Sparrow("cat", "white", "mew");

        Animal fish = new Fish("dog", "yellow", "bark");

        moveAnimal(sparrow);

    }

    private static void moveAnimal(Animal animal){
        animal.move();
    }

}
