class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
         
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for(List<Integer> list : freq) {
            list.stream().forEach(System.out::println);
        }
        // System.out.println(freq.length);
        for(int i = freq.length-1; i >= 1; i--) {
            if(freq[i].size() > 0) {
                for(int n : freq[i]) {
                    // System.out.println(index);
                    if(n != 0 && index < k ) {
                        res[index] = n;
                        index++;
                    }
                }
            }
        }
        return res;
    }
}
