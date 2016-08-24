package root.sid.linkedlist;
import java.util.Map;
/**
 * Created by siddhahast on 24/8/16.
 */
public class UtilsTest {

    public static void main(String[] args){
        int arr[]= {5, 10, 15, 30, 60, 45, 75, 20, 90, 1};
        Map<String, Integer> map = MyUtils.getMaxMin(arr);
        System.out.println(map.get("max"));
        System.out.println(map.get("min"));
    }
}
