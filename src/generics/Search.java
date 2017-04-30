package generics;

/**
 * Created by siddhahastmohapatra on 08/03/17.
 */
public class Search<T> {

    public T searchItemInBag(Item item, Bag bag){

        Node head = bag.head;
        while(head!=null){
            if(head.t.equals(item)){
                System.out.println("Item is found in the bag");
                return (T) head.t;
            } else{
                head = head.next;
            }
        }
        return null;
    }


}
