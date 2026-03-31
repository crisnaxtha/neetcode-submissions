class Solution {
    public boolean confusingNumber(int n) {
        while(n <= 0) {
            int rem = n % 10;
            n = n / 10;
            if(rem == 2 || rem == 3 || rem == 4 || rem == 5 || rem == 7) {
                return false;
            }
        }
        return true;
    }
}
