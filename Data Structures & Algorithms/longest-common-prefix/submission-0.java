class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int len = prefix.length();
        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, len-1);
                len--;
                if(len == 0) {
                    return "";
                }
            }
        }
        return prefix;
    }
}