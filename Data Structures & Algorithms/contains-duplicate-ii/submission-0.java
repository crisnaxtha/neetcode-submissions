class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int temp = map.get(nums[i]) - i;
                if(temp < 0) {
                    temp *= -1;
                }
                if(temp <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}