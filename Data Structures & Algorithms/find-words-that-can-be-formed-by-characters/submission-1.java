class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }

        for(String s : words) {
            Map<Character, Integer> tempmap = new HashMap<>(map);
            boolean contains = true;
            for(char c : s.toCharArray()) {
                if(tempmap.containsKey(c)) {
                    int x = tempmap.get(c);
                    if(x == 0) {
                        contains = false;
                        break;
                    }
                    tempmap.put(c, x-1);
                } else {
                    contains = false;
                    break;
                }
            }
            if(contains) {
                res += s.length();
            }
        }

        return res;
    }
}