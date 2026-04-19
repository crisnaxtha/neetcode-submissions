class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        int unique = 0;
        int dup = 0;
        for(int num[] : grid) {
            for(int n : num) {
                if(!set.contains(n)) {
                    set.add(n);
                } else {
                    dup = n;
                }
            }
        }
        
        int sq = grid.length * grid.length;
        int l = 1;
        while(l <= sq) {
            if(!set.contains(l)) {
                unique = l;
            }
            l++;
        }
        res[0] = dup;
        res[1] = unique;


        return res;
    }
}