class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int l = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for(int r = 0; r < s.length(); r++) {
            charMap.put(s.charAt(r), charMap.getOrDefault(s.charAt(r), 0) + 1);
            int max = charMap.values().stream().max(Integer::compareTo).orElse(0);
            while((((r-l + 1) - max)) > k) {
                charMap.put(s.charAt(l), charMap.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, charMap.values().stream().reduce(0, Integer::sum));
        }
        return res;
    }
}
