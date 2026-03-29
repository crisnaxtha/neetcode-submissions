class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len <= 1) {
            return;
        }
        int l = 0;
        for(int r = 1; r < len; r++) {
            if(nums[l] == 0) {
                if(nums[l] != nums[r]) {
                    int temp = nums[r];
                    nums[r] = nums[l];
                    nums[l] = temp;
                    l++;
                }
            } else {
                l++;
            }
        }
    }
}