package GraphDS;

/**
 * Created by siddhahastmohapatra on 24/11/16.
 */
public class AdjList {

    Bag bag;

    public AdjList(){
        bag = new Bag();
    }

    public void add(int data){
        bag.add(new Node(data));
    }


}
