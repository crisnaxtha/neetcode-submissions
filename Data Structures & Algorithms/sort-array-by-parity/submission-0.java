class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        if(len <=1) {
            return nums;
        }
        int l = 0;
        for(int r = 1; r < len; r++) {
            if(nums[l] % 2 != 0) {
                if(nums[r] % 2 == 0) {
                    int temp = nums[r];
                    nums[r] = nums[l];
                    nums[l] = temp;
                    l++;
                }
            } else {
                l++;
            }
        }
        return nums;
    }
}