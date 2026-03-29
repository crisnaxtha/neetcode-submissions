class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        if(s.length() <= 1) {
            return res;
        }
        
        for(int i = 1; i < s.length(); i++) {
            res += (s.charAt(i) - s.charAt(i-1)) < 0 ? -1 * (s.charAt(i) - s.charAt(i-1)) : s.charAt(i) - s.charAt(i-1);
        }
        return res;
    }
}