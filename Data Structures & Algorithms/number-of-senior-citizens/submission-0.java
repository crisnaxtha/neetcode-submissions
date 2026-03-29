class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for(String s : details) {
            if(Integer.parseInt(String.valueOf(s.charAt(11)) + String.valueOf(s.charAt(12))) > 60) {
                res++;
            }
        }
        return res; 
    }
}