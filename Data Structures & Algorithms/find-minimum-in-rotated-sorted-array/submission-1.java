class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0 && nums[i + 1] > nums[i]) {
                res = nums[i];
                 break;
            } else if(i == nums.length - 1 && nums[i-1] > nums[i]) {
                res = nums[i];
                break;
            } else if(nums[i-1] > nums[i] && nums[i+1] > nums[i]){
                res = nums[i];
                 break;
            }
        }
        return res;
    }
}
