class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        boolean inc = true;
        for(int r = 1; r < nums.length; r++) {
            if(nums[r - 1] > nums[r]) {
                inc = false;
                break;
            }
        }

        if(inc) {
            return true;
        }
        
        boolean dec = true;
        for(int d = 1; d < nums.length; d++) {
            if(nums[d-1] < nums[d]) {
                dec = false;
            }
        }
        if(dec) return true;

        return false;
    }
}