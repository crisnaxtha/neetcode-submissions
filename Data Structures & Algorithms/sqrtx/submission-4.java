class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        int mid = 0;
        long midsq = 0;
        while(l <= r) {
            mid = l + (r - l) / 2;
            midsq = (long) mid * mid;
            if(midsq > x) {
                r = mid - 1;
            } else if(midsq < x) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return (midsq) > x ? mid - 1 : mid;
    }
}