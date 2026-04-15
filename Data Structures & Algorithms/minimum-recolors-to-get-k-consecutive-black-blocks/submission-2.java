class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0, r = k;
        int res = Integer.MAX_VALUE;
        while(r <= blocks.length()) {
            int i = l;
            int count = 0;
            while(i < r) {
                if(blocks.charAt(i) == 'W') {
                    count++;
                }
                i++;
            }
            res = Math.min(res, count);
            l++;
            r++;
        }
        return res;
    }
}