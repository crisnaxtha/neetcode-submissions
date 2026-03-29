class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int l = 0;
        for(int r = 0; r < abbr.length(); r++) {
            if (l >= word.length()) return false;
            if(Character.isLetter(abbr.charAt(r))) {
                if(word.charAt(l) != abbr.charAt(r)) {
                    return false;
                }
                l++;
            } else if(Character.isDigit(abbr.charAt(r))) {
                if(abbr.charAt(r) == '0') {
                    return false;
                }
                int temp = r;
                while(r < abbr.length() && Character.isDigit(abbr.charAt(r))){
                    r++;
                }
                String t = abbr.substring(temp, r);
                int skip = Integer.parseInt(t);
                l += skip;
                r -= 1;
            }
        }
        return l == word.length();
    }
}