class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        Map<Integer, Integer> sMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
           sMap.put(target - nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int a = sMap.getOrDefault(nums[i], -1);
            if(i != a && a != -1) {
                twoSum[0] = a;
                twoSum[1] = i;
            }
        }
        Arrays.sort(twoSum);
        return twoSum;
    }
}
