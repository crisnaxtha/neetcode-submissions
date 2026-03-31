class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for(int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>(res.get(i-1));
            temp.add(0, 0);
            temp.add(0);
            List<Integer> row = new ArrayList<>();

            for(int j = 1; j < temp.size(); j++) {
                row.add(temp.get(j-1) + temp.get(j));
            }
            res.add(row);
        }

        return res;
    }
}