package Greedy;


/**
 * Created by siddhahastmohapatra on 04/12/16.
 */
public class Container implements Comparable<Container>{

    int id;
    int weight;

    @Override
    public int compareTo(Container o) {
        if(this.weight == o.weight){
            return 0;
        } else if(this.weight>o.weight){
            return 1;
        } else{
            return -1;
        }
    }
}
