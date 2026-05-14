class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int l = 0, r = 0;

        while (r < chars.length) {
            char ch = chars[r];
            int count = 0;
            while (r < chars.length && ch == chars[r]) {
                count++;
                r++;
            }
            chars[l] = ch;
            l++;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[l] = c;
                    l++;
                }
            }
        }
        return l;
    }
}