class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int maxProfit = 0;
        while(right< prices.length){
            if(prices[right] > prices[left]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}