class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean res = true;
        for(char ch : ransomNote.toCharArray()) {
            if(map.containsKey(ch)) {
                int temp = map.get(ch);
                if(temp <= 0) {
                    return false;
                }
                temp--;
                map.put(ch, temp);
            } else {
                return false;
            }
        }
        return res;
    }
}