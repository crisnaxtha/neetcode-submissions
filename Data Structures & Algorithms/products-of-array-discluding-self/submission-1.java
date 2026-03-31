class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int len = nums.length;
        int multi = 0;
        boolean zeroFlag = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(multi == 0) {
                    multi = 1 * nums[i];
                } else {
                    multi *=  nums[i];
                }
            } else {
                zeroFlag = true;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && zeroFlag) {
                res[i] = 0;
            } else if(nums[i] == 0 && zeroFlag) {
                res[i] = multi;
            } else if(nums[i] != 0) {
                res[i] = multi / nums[i];
            }
        }
        return res;
    }
}  
