package union_find;

/**
 * Created by siddhahastmohapatra on 18/12/16.
 */
public class UFTest {

    public static void main(String[] args) {
        UF uf = new UF(8);
        uf.union(3,8);
        uf.union(3,4);
        uf.displayPoints();
    }

}
