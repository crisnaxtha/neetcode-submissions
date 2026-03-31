class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>(); 
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if(map.containsKey(sChar) && map.get(sChar) != t.charAt(i)) {
                return false;
            }
            map.put(sChar, t.charAt(i));
        }
        return true;
    }
}