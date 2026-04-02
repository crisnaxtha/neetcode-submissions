class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int order = 0;
        int res = 1;
        int len = nums.length;
        for(int i = 1; i < len; i++) {
            if(nums[i - 1] < nums[i]) {
                if(order <= 0) {
                    count = 2;
                    order = 1;
                } else if(order > 0) {
                    count += 1;
                }
            } else if(nums[i-1] > nums[i]) {
                if(order >= 0) {
                    count = 2;
                    order = -1;
                } else if(order < 0) {
                    count += 1;
                }
            } else {
                order = 0;
                count = 1;
            }
            res = Math.max(res, count);
        }

        return res;
    }
}