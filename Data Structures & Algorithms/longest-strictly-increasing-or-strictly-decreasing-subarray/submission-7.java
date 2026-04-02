class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int order = 0; 
        int count = 0;
        int res = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] < nums[i]) {
                if(order <= 0) {
                    count = 2;
                    order = 1;
                } else {
                    count += 1;
                }
            } else if(nums[i-1] > nums[i]) {
                if(order >= 0) {
                    count = 2;
                    order = -1;
                } else {
                    count += 1;
                }
            } else {
                order = 0;
                count = 0;
            }
            res = Math.max(count, res);
        } 
        return res;
    }
}