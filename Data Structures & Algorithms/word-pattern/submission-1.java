class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
    
        int scount = 0;
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                scount++;
            }
        }
        System.out.println(scount);

        if(pattern.length() != scount+1) {
            return false;
        }

        String[] arr = s.split(" ");
        int i = 0;
        for(char c : pattern.toCharArray()) {
            if(map.containsKey(c) || map1.containsKey(arr[i])) { 
                if(!arr[i].equals(map.get(c)) || !Character.valueOf(c).equals(map1.get(arr[i]))) {
                    return false;
                }
            }
            map.put(c, arr[i]);
            map1.put(arr[i], c);
            i++;
        }

        return true;

    }
}