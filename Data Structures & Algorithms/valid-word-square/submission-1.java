class Solution {
    public boolean validWordSquare(List<String> words) {
        int i = 0;
        for(String str : words) {
            StringBuilder sb = new StringBuilder();
            for(String s : words) {
                if(i < s.length()) {
                    sb.append(s.charAt(i));
                }
            }

            if(!str.equals(sb.toString())) {
                return false;
            }
            i++;
        }
        return true;
    }
}
