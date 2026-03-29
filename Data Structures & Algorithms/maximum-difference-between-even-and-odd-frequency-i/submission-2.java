class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            set.add(c);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(char c : set) {
            int temp = map.get(c);
            if(temp % 2 == 0) {
                minEven = Math.min(temp, minEven);
            } else {
                maxOdd = Math.max(temp, maxOdd);
            }
        }
        return maxOdd - minEven;
    }
}