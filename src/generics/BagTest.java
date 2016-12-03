package generics;

/**
 * Created by siddhahastmohapatra on 26/11/16.
 */
public class BagTest {

    public static void main(String[] args) {


        Bag<Item> bag = new Bag();

        Address a1 = new Address("407", "Vijayasri GoldenOrchids", "560103");
        Address a2 = new Address("3083", "sobha Carnation", "560103");
        Address a3 = new Address("3083", "sobha Carnation", "560103");
        bag.add(a1);
        bag.add(a2);
        bag.add(a3);

        bag.display_all();


    }
}
