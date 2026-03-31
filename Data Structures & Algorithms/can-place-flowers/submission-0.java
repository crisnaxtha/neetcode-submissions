class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        
        if(len == 1) {
            return false;
        }
        int r = 1;
        while(r < len && n > 0) {
            if(flowerbed[r-1] == 1) {
                r++;
                continue;
            } else if(flowerbed[r] == 1) {
                r++;
                continue;
            }
            flowerbed[r] = 1;
            n--;
            r++;
            if(flowerbed[r-1] == 1 && flowerbed[r] == 1) {
                return false;
            }
        }
        return n==0;

        
    }
}