class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>(); 
        
        for(String s : strs) {
           char[] charArr = s.toCharArray();
           Arrays.sort(charArr);
           String sortedStr = new String(charArr);
           result.putIfAbsent(sortedStr, new ArrayList<String>());
           result.get(sortedStr).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
