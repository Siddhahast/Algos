package dynamic_programming;

/**
 * Created by siddhahastmohapatra on 19/01/17.
 */
public class StockProfitKTransactions {

    public static void main(String[] args) {
        int[] prices = {2, 5, 7, 1, 4, 3, 1, 3};
        maxProfit(prices, 3);
    }

    /*
    Faster solution.
     */
    public static void maxProfit(int[] prices, int k){
        if(k==0 || prices.length==0){
            return;// 0 is the profit
        }

        int[][] profit = new int[k+1][prices.length+1];

        for(int i=1;i<=k;i++){

            int max_diff = -prices[0];
            for(int j=1;j<prices.length;j++){

                profit[i][j] = Math.max(profit[i][j-1], prices[j]+max_diff);
                max_diff = Math.max(max_diff, profit[i-1][j] - prices[j]);
            }

        }
        System.out.print(profit[k][prices.length-1]);
    }

    /*
    Slower Solution
     */
    public static void calculateMaxProfit(int[] prices, int k){

        int[][] profit = new int[k+1][prices.length+1];

        for(int i=1;i<=k;i++){

            int maxprofit = 0;
            for(int j=1;j<=prices.length;j++){

            }

        }

    }
}
