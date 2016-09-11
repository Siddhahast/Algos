package root.sid.linkedlist;
import com.sid.Stacks.Stack;

import java.util.Map;
/**
 * Created by siddhahast on 24/8/16.
 */
public class UtilsTest {

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(4);


        Stack stack = new Stack(5);
        stack.add(n1);
        stack.add(n2);
        stack.add(n3);

        stack.addBottom(stack.top, new Node(10));

        stack.printreverse(stack.top);

    }
}
