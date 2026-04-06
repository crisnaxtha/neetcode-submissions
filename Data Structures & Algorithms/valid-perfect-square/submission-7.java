class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        int mid;
        long midsq;
        while(l <= r) {
            mid = l + (r - l) / 2;
            midsq = (long) mid * mid;

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