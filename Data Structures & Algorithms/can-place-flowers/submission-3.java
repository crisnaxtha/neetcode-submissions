class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int[] res = new int[len + 2];

        for(int i = 0; i < len; i++) {
            res[i + 1] = flowerbed[i];
        }
        
        for(int i = 0; i < len; i++) {
            System.out.println(res[i]);
        }

        for(int i = 1; i <= len; i++) {
            if(res[i-1] == 0 && res[i] == 0 && res[i+1] == 0) {
                res[i] = 1;
                n--;
            }
        }
        return n == 0;
    }
}