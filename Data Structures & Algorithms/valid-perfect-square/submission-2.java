class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1 || num == 4) {
            return true;
        }
        for(int i = 3; i < num/2; i++) {
            if(i * i == num) {
                return true;
            }
        }
        return false;
    }
}