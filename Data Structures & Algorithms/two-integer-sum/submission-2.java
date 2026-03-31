class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        Map<Integer, Integer> sMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
           sMap.put(target - nums[i], i);
           if(sMap.containsKey(nums[i]) && sMap.get(nums[i]) != i) {
               twoSum = new int[] {sMap.get(nums[i]), i};
           }
        }
        return twoSum;
    }
}
