class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int l = 0;
        for(int r = 0; r < abbr.toCharArray().length; r++) {
            System.out.println(abbr.charAt(r));
            System.out.println(word.charAt(l));
            if(Character.isLetter(abbr.charAt(r)) && word.charAt(l) != abbr.charAt(r)) {
                return false;
            } else if(Character.isDigit(abbr.charAt(r))) {
                if(abbr.charAt(r) == 0) {
                    return false;
                }
                int temp = r;
                while(Character.isDigit(abbr.charAt(r))){
                    r++;
                }
                String t = abbr.substring(temp, r);
                int skip = Integer.parseInt(t);
                System.out.println(skip);
                l += skip -1;
                r -= 1;
                System.out.println(" L " + l );
                System.out.println(" R " + r );
            } else {
                l++;
            }
            
        }
        return true;
    }
}