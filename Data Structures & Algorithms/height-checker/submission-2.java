class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        int i = 0;
        for(int n : heights) {
            expected[i] = n;
            i++;
        }
        Arrays.sort(expected);
        int res = 0;

        for(int j = 0; j < heights.length; j++) {
            if(heights[j] != expected[j]) {
                res++;
            }
        }

        return res;
    }
}