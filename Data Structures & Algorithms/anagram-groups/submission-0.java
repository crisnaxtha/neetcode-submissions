class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>(); 
        
        for(String s : strs) {
           char[] c = s.toCharArray();
           Arrays.sort(c);
           String sortedStr = Arrays.toString(c);
           result.putIfAbsent(Arrays.toString(c), new ArrayList<String>());
           result.get(sortedStr).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
