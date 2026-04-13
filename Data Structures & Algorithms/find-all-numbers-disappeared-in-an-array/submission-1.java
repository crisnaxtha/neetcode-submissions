class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++) {
            set.add(nums[i]);
        }

        for(int i = 1; i <= len; i++ ) {
            if(!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}