class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) {
            return false;
        }

        int l = 0;
        for(int r = 0; r < t.length(); r++) {
            if(s.charAt(l) == t.charAt(r) && l < s.length()) {
                l++;
            }
        }
        return l == s.length() ? true : false;
    }
}