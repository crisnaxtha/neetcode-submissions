class Solution {
    public int countElements(int[] arr) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr) {
            if(map.containsKey(num + 1)) {
                res = res + map.get(num + 1);
            }
        }
        return res;
    }
}
