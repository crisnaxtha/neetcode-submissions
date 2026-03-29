class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int r = arr.length - 1; r >= 0; r--) {
            int temp = arr[r];
            arr[r] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }
}