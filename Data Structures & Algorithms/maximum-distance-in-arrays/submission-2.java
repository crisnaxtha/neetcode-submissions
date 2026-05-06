class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
       List<Integer> max = new ArrayList<>();

       for(int i = 1; i < arrays.size(); i++) {
            List<Integer> temp = arrays.get(i-1);
            List<Integer> temp2 = arrays.get(i);
            if(temp.size() >= 2 && temp2.size() >= 2) {
                max.add(Math.max(Math.abs(temp2.get(temp2.size() - 1) - temp.get(0)), Math.abs(temp.get(temp.size() - 1) - temp2.get(0))));
            } else if(temp.size() == 1 && temp2.size() >= 2) {
                max.add(Math.max(Math.abs(temp2.get(temp2.size() - 1) - temp.get(0)), Math.abs(temp.get(0) - temp2.get(0))));
            } else if(temp.size() >= 2 && temp2.size() == 1) {
                max.add(Math.max(Math.abs(temp2.get(0) - temp.get(0)), Math.abs(temp.get(temp.size() - 1) - temp2.get(0))));
            } else if(temp.size() == 1 && temp2.size() == 1) {
                max.add(Math.abs(temp.get(0) - temp2.get(0)));
            }
       }

       Collections.sort(max);
       return max.get(max.size() - 1);
    }
}
