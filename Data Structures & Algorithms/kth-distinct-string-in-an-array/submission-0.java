class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();

        String res = "";

        for(String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int count = 0;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1 && count == k) {
                res = entry.getKey();
            } else if(entry.getValue() == 1) {
                count++;
            }
        }
        return res;
    }
}