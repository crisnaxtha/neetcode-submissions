class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0, r = nums1.length-1;
        int len1 = nums1.length, len2 = nums2.length;
        int i = 0;
        while(nums1[l] != 0) {
           l++;

            System.out.println(l);
        }
        for(int j = l; j < nums1.length && i < n; j++) {
            nums1[j] = nums2[i];
            i++;
        }

        Arrays.sort(nums1);
        
    }
}