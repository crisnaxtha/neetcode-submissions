class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int l = 0;
        for(int r = 0; r < abbr.toCharArray().length; r++) {
            System.out.println(abbr.charAt(r));
            System.out.println(word.charAt(l));
            if(Character.isLetter(abbr.charAt(r)) && word.charAt(l) != abbr.charAt(r)) {
                return false;
            } else if(Character.isDigit(abbr.charAt(r))) {
                int abbrInt = Integer.parseInt(Character.toString(abbr.charAt(r)));
                if(abbrInt == 0) {
                    return false;
                }
                l += abbrInt;
            }
            l++;
        }
        return true;
    }
}