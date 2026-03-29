class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            if(nums[i] < 0) {
                nums[i] = nums[i] * -1;
            }
        }

        Arrays.sort(nums);
        return nums;
    }
}