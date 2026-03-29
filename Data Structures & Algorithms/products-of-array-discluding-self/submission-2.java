class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int len = nums.length;
        int multi = 0;
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(multi == 0) {
                    multi = 1 * nums[i];
                } else {
                    multi *=  nums[i];
                }
            } else {
                zeroCount++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(zeroCount >= 2) {
                res[i] = 0;
            } else if(nums[i] != 0 && zeroCount == 1) {
                res[i] = 0;
            } else if(nums[i] == 0 && zeroCount == 1) {
                res[i] = multi;
            } else if(nums[i] != 0) {
                res[i] = multi / nums[i];
            }
        }
        return res;
    }
}  
