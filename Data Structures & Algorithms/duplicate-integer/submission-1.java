class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int n : nums) {
            if(numMap.getOrDefault(n, 0) != 0)  {
                return true;
            }
            numMap.put(n, numMap.getOrDefault(n, 0) + 1);
        }
        return false;
    }
}