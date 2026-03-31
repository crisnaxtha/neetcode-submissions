class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        if(nums.length <= 1) {
            return 1;
        }

        for(int r = 1; r < nums.length; r++) {
            if(nums[r-1] != nums[r]) {
                l = r;
            }
            
        }

        return l;
        
    }
}