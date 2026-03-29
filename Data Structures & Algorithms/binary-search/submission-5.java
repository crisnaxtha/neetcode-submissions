class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int index = -1;
        while(l <= r) {
            index = (l + r + 1) / 2;
            if(target == nums[index]) {
                return index;
            } else if(target > nums[index]) {
                l = index + 1;
            } else if(target < nums[index]) {
                r = index - 1;
            }
        }
        return -1;
    }
}
