class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int l = 0, r = 1; 
        while(r < prices.length) {
            maxprofit= Math.max(prices[r]-prices[l], maxprofit);
            if(prices[l] > prices[r]) {
                l = r;
            }
            r++;
        }
        return maxprofit;
    }
}
