class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        int i = 0;
        while(i < numRows -1) {
            List<Integer> row = new ArrayList<>();
            row.add(0);
            row.addAll(res.get(i));
            row.add(0);

            List<Integer> tempRow = new ArrayList<>();
            for(int r = 1; r < row.size(); r++) {
                tempRow.add(row.get(r-1) + row.get(r));
            }
            res.add(tempRow);
            i++;
        }
        return res;
    }
}