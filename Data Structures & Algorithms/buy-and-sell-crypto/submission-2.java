class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int l = 0, r = 1;

        while(r <= prices.length - 1) {
            if(prices[l] > prices[r]) {
                l = r;
            }
            if((prices[r] - prices[l]) > maxP) {
                maxP = prices[r] - prices[l];
            }
            r++;
        }
        return maxP;
    }
}
