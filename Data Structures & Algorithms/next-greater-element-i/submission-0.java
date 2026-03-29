class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] res = new int[nums1.length];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len2; i++) {
            map.put(nums2[i], i);
        }
        
        for(int i = 0; i < len1; i++) {
            int max = -1;
            if(map.containsKey(nums1[i])) {
                int temp = map.get(nums1[i]);
                temp += 1;
                while(temp < len2) {
                    if(nums1[i] < nums2[temp]) {
                        max = nums2[temp];
                        break;
                    }
                    temp++;
                }
            }
            res[i] = max;
        }

        return res;
    }
}