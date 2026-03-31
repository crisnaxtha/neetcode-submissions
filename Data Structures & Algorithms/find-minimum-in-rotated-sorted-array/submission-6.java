class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int res = 0;
        int l = 0, r = nums.length - 1;

        while( l <= r) {
            int mid = (l+r)/2;
            if(mid == l && nums[mid + 1] > nums[mid]) {
                return nums[mid];
            } else if(mid == r && nums[mid-1] > nums[mid]) {
                return nums[mid];
            } else if(mid != l && nums[mid-1] > nums[mid] && mid != nums.length - 1 && nums[mid+1] > nums[mid]){
                return nums[mid];
            }
            if(nums[mid] > nums[l]) {
                l = mid + 1;
            } else if(nums[mid] < nums[r]) {
                r = mid - 1;
            }
        }
        return res;
    }
}
