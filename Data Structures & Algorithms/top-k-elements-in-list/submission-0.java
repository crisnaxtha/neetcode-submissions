class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> r = new HashMap<>();

        for(int n : nums) {
            r.put(n, r.getOrDefault(n, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        r.forEach((key, val) -> {
            if(val >= k) {
                res.add(key);
            }
        });
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
