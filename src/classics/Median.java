package classics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 03/01/17.
 */
public class Median {

    public static void main(String[] args) {
        int[] arr = {5,10,3,20,25,7,15};
        System.out.print(getMedian(arr));
    }

    public static double getMedian(int arr[]){

        Queue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        Queue<Integer> highers = new PriorityQueue<Integer>();
        double[] medians = new double[arr.length];
        for(int w=0;w<arr.length;w++){
            addItemToHeaps(lowers, highers, arr[w]);
            rebalance(lowers, highers);
            medians[w] = calculateMedian(lowers, highers);
        }
        return medians[arr.length-1];

    }

    private static void addItemToHeaps(Queue<Integer> lowers, Queue<Integer> highers, int number){
        if(lowers.size()==0 || number<lowers.peek()){
            lowers.add(number);
        } else{
            highers.add(number);
        }

    }

    private static void rebalance(Queue<Integer> lowers, Queue<Integer> highers){
        Queue<Integer> bigger = lowers.size()>highers.size() ? lowers:highers;
        Queue<Integer> smaller = lowers.size()<=highers.size() ? lowers:highers;

        if((bigger.size()-smaller.size())>=2){
            smaller.add(bigger.poll());
        }
    }

    private static double calculateMedian(Queue<Integer> lowers, Queue<Integer> highers){
        if(lowers.size()==highers.size()){
            return (highers.peek()+lowers.peek())/2;
        } else{
            if(lowers.size()>highers.size()){
                return lowers.peek();
            } else{
                return highers.peek();
            }
        }

    }

    private static boolean process(Stack<Character> stack, char ch) {
        char top;
        switch (ch) {
            case '{':
                stack.push(ch);
                return true;

            case '[':
                stack.push(ch);
                return true;

            case '(':
                stack.push(ch);
                return true;

            case ')':
                top = stack.peek();
                if (top == '(') {
                    stack.pop();
                    return true;
                } else {
                    return false;
                }

            case ']':
                top = stack.peek();
                if (top == '[') {
                    stack.pop();
                    return true;
                } else {
                    return false;
                }

            case '}':
                top = stack.peek();
                if (top == '{') {
                    stack.pop();
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }
    
}
