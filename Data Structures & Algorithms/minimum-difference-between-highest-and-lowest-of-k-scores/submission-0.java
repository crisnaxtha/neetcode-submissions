class Solution {
    public int minimumDifference(int[] nums, int k) {
        int l = 0, r = k - 1;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        if(k == 1) return 0;
        while(r < nums.length) {
            int sub = nums[r] - nums[l];
            res = Math.min(sub, res);
            r++;
            l++;
        }
        return res;
    }
}