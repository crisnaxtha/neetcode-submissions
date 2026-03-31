class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if(h == piles.length ) {
            return piles[piles.length - 1];
        } 
        if(h == piles[piles.length - 1]) {
            return h;
        } else if( h > piles[piles.length - 1]) {
            int i = 1;
            int avg = h / piles[piles.length - 1];
            // System.out.println(avg);
            // while ( i < piles[piles.length - 1]) {
            //     i++;
            // }
            return avg;
        } 
        return piles[piles.length - 1];
    }
}
