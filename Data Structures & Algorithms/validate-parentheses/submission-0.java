class Solution {
    public boolean isValid(String s) {
       int n = s.length();
        if(n % 2 != 0) {
            return false;
        }
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('[', ']');
        parenthesesMap.put(']', '[');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('}', '{');
        parenthesesMap.put('(', ')');
        parenthesesMap.put(')', '(');
        for(int i = 0; i < n/2; i++) {
            if(s.charAt(i) != parenthesesMap.get(s.charAt(n-1-i))) {
                return false;
            }
        }

        return true;
    }
}
