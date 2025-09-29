class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cheapestPrice = prices[0];
        for(int i=1; i< prices.length; i++) {
            if(prices[i] < cheapestPrice) {
                cheapestPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - cheapestPrice);
        }
        return profit;
    }
}