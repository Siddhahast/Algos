package SearchUtil;

import java.util.Comparator;

/**
 * Created by siddhahastmohapatra on 15/11/16.
 */
public class Item implements Comparable<Item>{

    int data;

    @Override
    public int compareTo(Item o) {
        if(this.data == o.data){
            return 0;
        } else if(this.data>o.data){
            return 1;
        } else{
            return -1;
        }
    }
}
