class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> seens = new HashMap<>();
        int res = 0;
        int l = 0, r = 0;
        while(r < s.length()) {
            seens.put(s.charAt(r), seens.getOrDefault(s.charAt(r), 0) + 1);

            while(seens.size() > k) {
                seens.put(s.charAt(l), seens.get(s.charAt(l)) - 1);
                if(seens.get(s.charAt(l)) == 0) {
                    seens.remove(s.charAt(l));
                }
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    }
}
