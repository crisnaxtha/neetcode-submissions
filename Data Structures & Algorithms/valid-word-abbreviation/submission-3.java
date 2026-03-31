class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int l = 0; 
        for(int r = 0; r < abbr.length(); r++) {
            if(l >= word.length()) return false;
            if(Character.isLetter(abbr.charAt(r))) {
                if(abbr.charAt(r) != word.charAt(l)) {
                    return false;
                }
                l++;
            } else if(Character.isDigit(abbr.charAt(r))) {
                if(abbr.charAt(r) == '0') return false;
                String temp = "";
                while(r < abbr.length() && Character.isDigit(abbr.charAt(r))) {
                    temp = temp + abbr.charAt(r);
                    r++;
                }
                System.out.println("temp" + temp);
                int t = Integer.parseInt(temp);
                l += t;
                r -= 1;
            }
        }
        return true;
    }
}