class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(arr[i], rightMax);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }
}