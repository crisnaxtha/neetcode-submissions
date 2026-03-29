class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> res = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                res.push(c);
            } else if(res.isEmpty() && (c == ')' || c == '}' || c == ']')) {
                return false;
            }
            else if (c == ')' && res.peek() == '(') {
                res.pop();
            }else if(c == '}' && res.peek() == '{') {
                res.pop();
            } else if(c == ']' && res.peek() == '[') {
                res.pop();
            } else {
                return false;
            }
            System.out.println(c);
        }
        return res.isEmpty();
    }
}
