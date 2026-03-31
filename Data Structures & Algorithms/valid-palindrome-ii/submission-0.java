class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        int count = 0;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                count++;
                if(count > 1) {
                    return false;
                }
                if(s.charAt(l+1) == s.charAt(r)) {
                    l++;
                } else {
                    r--;
                }
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}