class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            long midsq = (long) mid * mid;

            if( midsq > num) {
                r = mid - 1;
            } else if(midsq < num) {
                l =  mid + 1;
            } else {
                return true;
            }

        }
        return false;
    }
}