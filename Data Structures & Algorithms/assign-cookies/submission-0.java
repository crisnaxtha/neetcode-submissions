class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0, r = 0;
        int res = 0;
        while(l < g.length && r < s.length) {
            if(s[r] >= g[l]) {
                res++;
                l++;
            }
            r++;
        }
        return res;
    }
}