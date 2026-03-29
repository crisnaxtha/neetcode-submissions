class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }

        int l = 1, r;
        
        for( r = 1; r < nums.length; r++) {
            if(nums[r - 1] != nums[r]) {
                nums[l] =  nums[r];
                l++;
            }
        }
        return l;
    }
}