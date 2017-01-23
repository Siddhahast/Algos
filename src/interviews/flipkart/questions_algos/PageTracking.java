package interviews.flipkart.questions_algos;

import java.util.Stack;

/**
 * Created by siddhahastmohapatra on 01/01/17.
 */
public class PageTracking {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,1,4,5,8, -1};
        Stack<Integer> pages = new Stack<Integer>();
        boolean backTrack = false;
        pages.push(arr[0]);
        for (int i=1;i<arr.length-1;i++){
            backTrack = isBacktracking(pages, arr[i], arr[i+1]);
            if(backTrack){
                int a = Integer.MAX_VALUE;
                break;
            }
        }
        System.out.println(backTrack);
    }

    private static boolean isBacktracking(Stack<Integer> pages, int currentPage, int nextPage){

        if(!pages.isEmpty() || nextPage<1){
            if(pages.peek()==nextPage){
                currentPage = pages.pop();
            } else{
                pages.push(currentPage);
                currentPage = nextPage;
            }
        }

        if(pages.isEmpty()){
            return true;
        }
        return false;
    }

}
