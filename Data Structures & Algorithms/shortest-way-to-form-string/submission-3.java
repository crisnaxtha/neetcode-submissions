class Solution {
    public int shortestWay(String source, String target) {
        int res = 0; 
        int s = source.length();
        int t = target.length();

        int l = 0, r = 0; 
        while(r < t) {
            int L = 0;
            int count = 0;
            while(L < s && r < t) {
                char schar = source.charAt(L);
                char tchar = target.charAt(r);
                if(schar == tchar) {
                    count++;
                    r++;
                }
                L++;
            }
            if(count == 0) {
                return -1;
            } else {
                res += 1;
            }
        }
        return res;
    }
}
