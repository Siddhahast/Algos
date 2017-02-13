package BuilderPattern;

/**
 * Created by siddhahastmohapatra on 28/01/17.
 */
public class BuilderTest {

    public static void main(String[] args) {

        Person person = new Person.Builder("Siddhahast", "sid@gmail.com").setAddress("Bangalore").setAge(28).build();
        System.out.println(person);
    }

}
