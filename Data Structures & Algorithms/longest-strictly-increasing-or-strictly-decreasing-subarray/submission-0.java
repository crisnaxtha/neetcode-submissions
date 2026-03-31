class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int curr = 1;
        int res = 1;
        int increasing = 0; // Changed from 1 to 0 to handle initial state correctly

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] < nums[i]) {
                if(increasing > 0) {
                    curr += 1;
                } else {
                    curr = 2;
                    increasing = 1;
                }

            } else if(nums[i - 1] > nums[i]) {
                if(increasing < 0) {
                    curr += 1;
                } else {
                    curr = 2;
                    increasing = -1;
                }
            } else {
                curr = 1;
                increasing = 0;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
}