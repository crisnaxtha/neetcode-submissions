class Solution {
    public int shortestWay(String source, String target) {
        int res = 0; 
        int s = source.length();
        int t = target.length();

        int r = 0; 
        while(r < t) {
            int l = 0;
            int count = 0;
            while(l < s && r < t) {
                if(source.charAt(l) == target.charAt(r)) {
                    count++;
                    r++;
                }
                l++;
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
