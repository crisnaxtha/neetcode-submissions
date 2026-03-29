class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        if(nums[0] == 1){
            max = 1; 
            count = 1;
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == 0 && nums[i] != nums[i-1] ) {
                max = Math.max(max, count);
                count = 0;
            } else if(nums[i] == 1) {
                count++;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}