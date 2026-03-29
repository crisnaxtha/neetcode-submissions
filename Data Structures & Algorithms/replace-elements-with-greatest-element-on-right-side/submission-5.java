class Solution {
    public int[] replaceElements(int[] arr) {
        int great = -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = great;
            great = Math.max(temp, great);
        }
        return arr;
    }
}