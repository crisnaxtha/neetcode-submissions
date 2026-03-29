class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1;
        if(nums.length <= 1) {
            return l;
        }

        for(int r = 1; r < nums.length; r++) {
            if(nums[r-1] != nums[r]) {
                nums[l] = nums[r];
                l++;;
            }
            
        }

        return l;
    }
}