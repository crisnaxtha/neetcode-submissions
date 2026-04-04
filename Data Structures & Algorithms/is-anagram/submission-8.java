class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for(char c : s.toCharArray()) { 
            if(Character.isLetterOrDigit(c)) {
                smap.put(c, smap.getOrDefault(c, 0) + 1);
            }
            
        }

        for(char c : t.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                tmap.put(c, tmap.getOrDefault(c, 0) + 1);
            }
            
        }

        for(Map.Entry<Character, Integer> entry : smap.entrySet()) {
            System.out.println("S" + entry.getValue() + "T" + tmap.get(entry.getKey()));
            if(!entry.getValue().equals(tmap.get(entry.getKey()))) {
                System.out.println("HELLO");
                return false;
            }
        }
        return true;
    }
}
