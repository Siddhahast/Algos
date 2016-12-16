package Trees;

/**
 * Created by siddhahastmohapatra on 14/12/16.
 */
public class BST_Test {

    public static void main(String[] args) {
        BST<String, Integer> bst = new BST<String, Integer>();
        bst.put("S",20);
        bst.put("E",5);
        bst.put("A",1);
        bst.put("R",17);
        bst.put("H",8);
        bst.put("M",16);
        bst.put("X",24);
        bst.put("C",3);
        String min = bst.getMinimum();
        System.out.print(min);
    }
}
