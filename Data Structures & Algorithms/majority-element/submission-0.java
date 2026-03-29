class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        int maj = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int num = entry.getKey();
            if(count > maj) {
                maj = count;
                res = num;
            }
        }
        return res;
    }
}