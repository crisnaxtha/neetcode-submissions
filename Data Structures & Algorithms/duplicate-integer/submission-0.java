class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dupCount = new HashMap<>();
        for(int n : nums) {
            dupCount.put(n, (dupCount.getOrDefault(n, 0) + 1));
            int nu = dupCount.getOrDefault(n, 0);
            if(nu > 1) {
                return true;
            }
            
        }
        return false;
    }
}
