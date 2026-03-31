class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        while(l < r) {
            mid = (l + r + 1) / 2;
            // System.out.println(mid);
            if(nums[mid] == target) return mid;
            if(target < nums[mid]) {
                r = mid - 1;
                l++;
            }
            if(target > nums[mid]) {
                l = mid + 1;
                r--;
            }
        }
       return -1; 
    }
}
