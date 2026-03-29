class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length == 0) {
            return nums;
        }
        int len = nums.length;
        int[] res = new int[len * 2]; 
        for(int i = 0; i < len; i++) {
            res[i] = nums[i];
        }

        for(int i = len; i < res.length; i++) {
            res[i] = nums[i - len];
        }
        return res;
    }
}