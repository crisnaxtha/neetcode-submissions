class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        int count = 1;
        Arrays.sort(nums);
        Map<Integer, Integer> seq = new HashMap<>();
        int l = 0, r = 1;
        while(r < nums.length) {
            if(nums[l] + 1 == nums[r]) {
                count++;
                l = r;
            } else if(nums[l] == nums[r]) {
                r += 1;
                continue;
            }
            r += 1;
        }
        return count;
    }
}
