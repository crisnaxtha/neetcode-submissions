class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }

        int l = 0;
        int profit = 0;
        for(int r = 1; r < prices.length; r++) {
            profit = prices[r] - prices[l] > profit ? prices[r] - prices[l] : profit;
            if(prices[l] > prices[r]) {
                l = r;
            }
        }
        return profit;
    }
}
