class Solution {
    public int maxArea(int[] heights) {
        int c = 0;
        int l = 0, r = heights.length - 1;

        while( l < r ) {
            if(heights[l] < heights[r]) {
                int tempC = heights[l] * (r - l);
                if(tempC > c) {
                    c = tempC;
                }
                l++;
            } else if(heights[l] > heights[r]) {
                int tempC = heights[r] * (r-l);
                if(tempC > c) {
                    c = tempC;
                }
                r--;
            } else {
                int tempC = heights[r] * (r-l);
                if(tempC > c) {
                    c = tempC;
                }
                l++;
                r--;
            }
        }
        return c;
    }
}
