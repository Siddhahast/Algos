package generics;

/**
 * Created by siddhahastmohapatra on 08/03/17.
 */
public class SearchApp {

    public static void main(String[] args) {

        Bag<Item> bagOfItems = new Bag<Item>();

        Ball b1 = new Ball("cosco");
        Ball b2 = new Ball("kookaboora");
        Ball b3 = new Ball("vicky");
        b3.match = "Test-Match";
        bagOfItems.add(b1);
        bagOfItems.add(b2);
        bagOfItems.add(b3);

        Search<Item> itemSearch = new Search<Item>();

        Item item = itemSearch.searchItemInBag(new Ball("kookaboora"), bagOfItems);

        System.out.println(item.getMatchType());

    }

}
