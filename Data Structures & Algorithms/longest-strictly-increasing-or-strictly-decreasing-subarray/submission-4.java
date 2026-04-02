class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int curr = 1;
        int res = 1;
        int increasing = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] < nums[i]) {
                if(increasing > 0) {
                    curr++;
                } else {
                    curr = 2;
                    increasing = 1;
                }
            } else if(nums[i - 1] > nums[i]) {
                if(increasing < 0) {
                    curr++;
                } else {
                    curr = 2;
                    increasing = -1;
                }
            } else {
                curr = 1;
                increasing = 0;
            }
            res = Math.max(curr, res);
        }
        return res; 
    }
}