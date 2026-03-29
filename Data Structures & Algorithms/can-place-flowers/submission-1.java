class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] arr = new int[flowerbed.length + 2];
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if( i == 0 || i == len - 1) {
                arr[i] = 0;
            } else {
                arr[i] = flowerbed[i - 1];
            }
        }
        int count = 0;
        for(int i = 1; i < len - 1; i++) {
            if(arr[i-1] == 0 && arr[i] == 0 && arr[i + 1] == 0) {
                arr[i] = 1;
                count++;
            }
        }
        return count >= n;

    }
}