class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int l = 0, r = 1;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(l));
        while(r < s.length()) {
            if(set.contains(s.charAt(r))) {
                if(maxLen < set.size()) {
                    maxLen = set.size();
                }
                set = new HashSet<>();
                l = r;
            } 
            set.add(s.charAt(r));
            
            r++;
        }
        return maxLen > set.size() ? maxLen : set.size();
    }
}
