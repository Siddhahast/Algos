package interviews.flipkart.sellingprice;

/**
 * Created by siddhahastmohapatra on 01/01/17.
 */
public class App {

    public static void main(String[] args) {
        StoreManager manager = new StoreManager();

        manager.addProduct("p1");
        manager.addProduct("p2");
        manager.addProduct("p3");
        manager.addProduct("p4");
        manager.addProduct("p5");
        manager.addProduct("p6");
        manager.addProduct("p7");

        manager.purchase("u1", "p1");
        manager.purchase("u1", "p2");
        manager.purchase("u1", "p3");
        manager.purchase("u2", "p3");
        manager.purchase("u2", "p4");

        manager.purchase("u3", "p1");
        manager.purchase("u3", "p2");
        manager.returnProduct("u3", "p2");

        manager.blackListUser("u2");

        manager.displayBestSellingProduct();

    }


}
