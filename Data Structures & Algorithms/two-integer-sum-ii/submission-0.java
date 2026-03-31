class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = 1;
        int[] res = new int[2];
        while(r < numbers.length) {
            if(numbers[l] + numbers[r] == target) {
                res[0] = numbers[l];
                res[1] = numbers[r];
            }
            r++;
        }
        return res;
    }
}
