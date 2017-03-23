import java.util.Arrays;

/*
 * Say you have an array for which the ith element is the price of a given stock 
 *on day i. If you were only permitted to complete at most one transaction 
 *(ie, buy one and sell one share of the stock)design an algorithm to find the maximum profit.
 */
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int []	prices = {};
		System.out.println(maxProfit2(prices));
	}

    public static int maxProfit(int[] prices) {
    	int profit = 0;
    	int low = Integer.MAX_VALUE;
    	for(int i = 0; i < prices.length; i++) {
    		if(prices[i] < low) {
    			low = prices[i];
    		} else if(prices[i] - low > profit) {
    			profit = prices[i] - low;
    		}
    	}
    	return profit;
    }

    public static int maxProfit2(int[] prices) {
    	if(prices.length == 0) return 0;
    	int [] dp = new int[prices.length];
    	dp[0] = 0;
    	int low = prices[0];
    	for(int i = 1; i < prices.length; i++) {
    		if(prices[i] < low) {
    			low = prices[i];
    		}
    		dp[i] = Math.max(dp[i - 1], prices[i] - low);
    	}
    	return dp[prices.length - 1];
    }
}
