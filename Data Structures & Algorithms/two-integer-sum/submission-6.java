class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            System.out.println("Nums " +num);
            if(map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println("Keys " + m.getKey());
            System.out.println("Values " + m.getValue());
        }
        return new int[]{-1, -1};
    }
}
