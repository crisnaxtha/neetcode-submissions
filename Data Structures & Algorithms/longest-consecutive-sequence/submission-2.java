class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int count = 1;
        Arrays.sort(nums);
        List<Integer> largeCount = new ArrayList<>();
        int l = 0, r = 1;
        while(r < nums.length) {
            if(nums[l] + 1 == nums[r]) {
                count++;
                l = r;
            } else if(nums[l] == nums[r]) {
                l = r;
                r += 1;
                continue;
            } else if(nums[l] + 1 != nums[r]) {
                largeCount.add(count);
                count = 1;
                l = r;
                
            }
            if(r+ 1 == nums.length) {
                largeCount.add(count);
            }
            r += 1;
        }
        return largeCount.isEmpty() ? count : 
        count > largeCount.stream().max(Integer::compareTo).orElse(0) ? count : largeCount.stream().max(Integer::compareTo).orElse(0).intValue();
    }
}
