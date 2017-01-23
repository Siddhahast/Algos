package interviews.flipkart.tuples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 05/01/17.
 */
public class Bag {

    private List<Integer> items;

    public Bag(){
        items = new ArrayList<Integer>();
    }

    public List<Integer> adj(){
        return items;
    }

    public void add(int a){
        if(!items.contains(new Integer(a))){
            items.add(a);
        }
    }

    public int size(){
        return items.size();
    }
}
