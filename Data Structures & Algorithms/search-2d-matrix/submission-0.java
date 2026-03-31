class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int t = 0, b = matrix.length - 1;
        while(t <= b) {
            int mid = t + (b-t) /2;
            int[] midArrs = matrix[mid];
            if(midArrs[0] == target || midArrs[midArrs.length -1] == target) {
                return true;
            } 
            if(midArrs[0] > target) {
                b = mid - 1;
            } else if(midArrs[0] < target && target < midArrs[midArrs.length - 1]) {
                int l = 0, r = midArrs.length - 1;
                while(l <= r) {
                    int m = l + (r-l)/2;
                    if(midArrs[m] == target) {
                        return true;
                    }

                    if(midArrs[m] > target) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
                return false;
            } else {
                t = mid - 1;
            }
        }
        return false;
    }
}
