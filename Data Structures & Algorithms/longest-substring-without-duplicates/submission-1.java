class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int l = 0, r = 1;
        int[] res = new int[s.length()];
        int maxLen = 1;
        int count = 1;
        while(r < s.length()) {
            if(s.charAt(l) == s.charAt(r)) {
                l = r;
                if(maxLen < count) maxLen = count;
                count = 1;
            } else if(s.charAt(r) == s.charAt(r-1)) {
                l = r;
                count = 1;
            } else {
                count++;
            }
            r++;
        }
        return maxLen > count ? maxLen : count;
    }
}
