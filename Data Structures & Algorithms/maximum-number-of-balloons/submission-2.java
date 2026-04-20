class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;

        for(char c : text.toCharArray()) {
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getKey() == 'l' || entry.getKey() == 'o') {
                res = Math.min(res, entry.getValue() / 2);
            } else {
                res = Math.min(res, entry.getValue());
            }
        }
        return map.size() == 5 ? res : 0;
    }
}