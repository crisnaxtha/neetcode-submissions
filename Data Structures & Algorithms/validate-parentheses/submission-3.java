class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                res.push(c);
            } else if(c == ')' && !res.isEmpty() && res.peek() == '(') {
                res.pop();
            } else if(c == '}' && !res.isEmpty() && res.peek() == '{') {
                res.pop();
            } else if(c == ']' && !res.isEmpty() && res.peek() == '[') {
                res.pop();
            }
            System.out.println(c);
        }
        return res.isEmpty();
    }
}
