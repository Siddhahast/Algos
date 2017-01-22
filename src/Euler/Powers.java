package Euler;

/**
 * Created by siddhahastmohapatra on 11/01/17.
 */
public class Powers {

    private static int getCombinations(int n, int k){
        if(n<=0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        int ways = 0;
        int targetLeft = (int) (n - Math.pow(2, 0));
        int targetRight = (int) (n- Math.pow(2,1));

        for(int i=0;i<2;i++){
            ways = getCombinations(targetLeft, k);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getCombinations(10,0));

    }

}
