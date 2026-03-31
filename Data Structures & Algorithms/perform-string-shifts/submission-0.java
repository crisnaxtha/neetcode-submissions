class Solution {
    public String stringShift(String s, int[][] shift) {
        StringBuilder sb = new StringBuilder(s);
        for(int[] arr : shift) {
            int amount = arr[1] % s.length();
            if(arr[0] == 0) {
                String cutString = s.substring(0, amount);
                s = s.substring(amount, s.length());
                s = s.concat(cutString);
            } else {
                String cutString = s.substring(s.length() - amount, s.length());
                s = s.substring(0, s.length() - amount);
                s = s.concat(cutString);
            }
        }
        return s;
    }
}