class Solution {
    public int scoreOfString(String s) {
        if(s.length() <= 1) {
            return s.charAt(s.length()-1);
        }
        int res = 0;
        for(int i = 1; i < s.length(); i++) {
            res += (s.charAt(i) - s.charAt(i-1)) < 0 ? -1 * (s.charAt(i) - s.charAt(i-1)) : s.charAt(i) - s.charAt(i-1);
        }
        return res;
    }
}