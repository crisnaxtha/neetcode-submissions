class Solution {
    public void reverseWords(char[] s) {
        int len = s.length;
        int l = 0, r = len - 1;
        while(l <= r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

        int L = 0, R = 0; 
        while(R < len) {
            if(s[R] == ' ' || R == len - 1) {
                int x = R - 1;
                int y = L;
                if(R == len - 1) {
                    x = R;
                }
                L = R + 1;
                while(y <= x) {
                    char t = s[x];
                    s[x] = s[y];
                    s[y] = t;
                    x--;
                    y++;
                }
            }
            R++;
        }
    }
}
