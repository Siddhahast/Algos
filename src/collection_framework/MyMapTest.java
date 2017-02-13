package collection_framework;
import java.util.*;
/**
 * Created by siddhahastmohapatra on 28/01/17.
 */
public class MyMapTest {

    public static void main(String[] args) {

        MyMap<String , Integer> map = new MyMap<String, Integer>();
        map.put("Siddhahast", 28);
        map.put("Mohapatra", 29);

        System.out.println(map.get("Siddhahast"));

        map.remove("Mohapatra", 29);



        System.out.println(map.get("Mohapatra"));

        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Siddhahast", 25);
        m.put("Mohapatra", 36);

        m.remove("Siddhahast");

        System.out.println(m.get("Siddhahast"));
    }
}
