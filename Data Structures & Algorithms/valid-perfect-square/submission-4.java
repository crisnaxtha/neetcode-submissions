class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i = 0; i <= num; i++) {
            int sq = i * i;
            if(sq == num) {
                return true;
            } else if( sq > num) {
                break;
            }
        }
        return false;
    }
}