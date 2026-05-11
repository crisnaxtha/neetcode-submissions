class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int p = 0; p < k; p++) {
                if (mat1[i][p] != 0) {
                    for (int j = 0; j < n; j++) {
                        res[i][j] += mat1[i][p] * mat2[p][j];
                    }
                }
            }
        }

        return res;
    }
}
