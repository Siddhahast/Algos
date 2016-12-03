package generics;

/**
 * Created by siddhahastmohapatra on 26/11/16.
 */
public class Box<T> {

    /*
    Generic procedure to know what elements in an array are greater than an element
     */
    public static <T extends Comparable<T>> int countGreaterThan(T[] elems, T elem){
        int counts = 0;
        for (T e: elems){
            if(e.compareTo(elem)>0){
                counts++;
            }
        }
        return counts;
    }

    

}
