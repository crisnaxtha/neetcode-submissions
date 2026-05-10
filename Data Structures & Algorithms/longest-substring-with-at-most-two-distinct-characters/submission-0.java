class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int res = 0;

        Map<Character, Integer> counts = new HashMap<>();
        int l = 0, r = 0;
        while(r < s.length()) {
            char ch = s.charAt(r);
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
            
            while(counts.size() > 2) {
                char leftChar = s.charAt(l);
                counts.put(leftChar, counts.get(leftChar) - 1);
                if (counts.get(leftChar) == 0) {
                    counts.remove(leftChar);
                }
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}