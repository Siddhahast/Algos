package classics;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 15/01/17.
 *
 * Design a stack in such a way that - we get the min element in the stack in O(1).
 */
public class SpecialStack<T extends Comparable<T>> {


    private Stack<T> primary;
    private Stack<T> auxilliary;

    public SpecialStack(){
        primary = new Stack<T>();
        auxilliary = new Stack<T>();
    }

    public void push(T t){
        if(primary.isEmpty() || auxilliary.isEmpty()){
            primary.push(t);
            auxilliary.push(t);
        }

        int comp = t.compareTo(auxilliary.peek());
        if(comp>0){
            T top = auxilliary.peek();
            auxilliary.push(top);
            primary.push(t);
        } else{
            auxilliary.push(t);
            primary.push(t);
        }

    }

    public T pop(){
        auxilliary.pop();
        return primary.pop();
    }

    public T getMin(){
        return auxilliary.peek();
    }

}
