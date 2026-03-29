class Solution {
    public int countElements(int[] arr) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }

     

        for(int num : arr) {
            if(set.contains(num + 1)) {
                res = res + 1;
            }
        }
        return res;
    }
}
