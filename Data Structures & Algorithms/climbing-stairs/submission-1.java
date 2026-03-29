class Solution {
    public int climbStairs(int n) {
        int one = 1, two = 1, temp;
        for(int i = 1; i < n; i++) {
            temp = one;
            one = one + two;
            two = temp; 
        }
        return one;
    }
}
