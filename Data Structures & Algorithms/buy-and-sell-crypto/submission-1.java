class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, maxP = 0;
        while(r < prices.length) {
            if(maxP < prices[r] - prices[l]) {
                maxP = prices[r] - prices[l];
            }
            if(prices[l] > prices[r]) { l = r; }
            r++;
        }
        return maxP;
    }
}
