LeetCode - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start = prices[0];
        for(int i=0; i<= prices.length -1; i++){
            start = Math.min(start, prices[i]);
            int profit = prices[i] - start;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}

OR

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        
        for(int i=0; i< prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }    
            else if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}