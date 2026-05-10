class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int res = 0; 

        Map<Character, Integer> seens = new HashMap<>();

        int l = 0, r = 0;
        while(r < s.length()) {
            seens.put(s.charAt(r), seens.getOrDefault(s.charAt(r), 0) + 1);
            while(seens.size() > 2) {
                char leftChar = s.charAt(l);
                seens.put(leftChar, seens.get(leftChar) - 1);
                if(seens.get(leftChar) == 0) {
                    seens.remove(leftChar);
                }
                l++;
                
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}