package array_algos;

/**
 * Created by siddhahastmohapatra on 20/11/16.
 */
public class Element implements Comparable<Element> {
    int data;

    @Override
    public int compareTo(Element element) {
        if(this.data == element.data){
            return 0;
        } else if(this.data>element.data){
            return 1;
        } else{
            return -1;
        }
    }
}
