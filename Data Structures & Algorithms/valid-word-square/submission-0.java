class Solution {
    public boolean validWordSquare(List<String> words) {
        int i = 0;
        for(String s : words) {
            StringBuilder sb = new StringBuilder();
            for(String s1 : words) {
                if(i < s1.length()) {
                    sb.append(s1.charAt(i));
                }
                
            }
            if(!s.equals(sb.toString())) {
                return false;
            }
            i++;
        }
        return true;
    }
}
