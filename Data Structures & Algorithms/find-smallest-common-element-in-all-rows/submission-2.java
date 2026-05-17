class Solution {
    public int smallestCommonElement(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int c = 0; c < n; c++) {
            int num = mat[0][c];
            boolean foundInAll = true;
            for (int r = 1; r < m; r++) {
                int index = Arrays.binarySearch(mat[r], num);
                if (index < 0) {
                    foundInAll = false;
                    break;
                }
            }
            if (foundInAll) {
                return num;
            }
        }

        return -1;
    }
}
