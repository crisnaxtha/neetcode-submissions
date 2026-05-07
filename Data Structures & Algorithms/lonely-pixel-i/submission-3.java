class Solution {
    public int findLonelyPixel(char[][] picture) {
        int res = 0;
        Map<Integer, Integer> uniqRow = new HashMap<>();
        Map<Integer, Integer> uniqCol = new HashMap<>();

        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[i].length; j++) {
                System.out.println(i + " " + j + " " + picture[i][j]);
                if('B' == picture[i][j]){
                    
                    uniqRow.put(i, uniqRow.getOrDefault(i, 0) + 1);
                    uniqCol.put(j, uniqCol.getOrDefault(j, 0) + 1);
                }
            }
        }
 
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[i].length; j++) {
                System.out.println(i + " " + j + " " + picture[i][j]);
                if('B' == picture[i][j] && uniqRow.get(i) == 1 && uniqCol.get(j) == 1){
                    
                    res++;
                }
            }
        }

        return res;



    }
}