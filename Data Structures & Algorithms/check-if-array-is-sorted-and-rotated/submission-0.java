class Solution {
    public boolean check(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        if(nums.length == 1) {
            return true;
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] > nums[i]) {
                count = i;
            }
        }
        int j = 0;
        for(int i = count; i < nums.length; i++) {
            arr[j] = nums[i];
            j++;
        }
        for(int i = 0; i < count; i++) {
            arr[j] = nums[i];
            j++;
        }

        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1 ] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}