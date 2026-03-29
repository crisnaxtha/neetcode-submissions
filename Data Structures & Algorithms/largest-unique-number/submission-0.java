class Solution {
    public int largestUniqueNumber(int[] nums) {
        int large = -1; 
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                large = Math.max(entry.getKey(), large);
            }
        }

        return large;        
    }
}
