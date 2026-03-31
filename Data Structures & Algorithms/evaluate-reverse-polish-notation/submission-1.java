class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length <= 3) return 0;
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int signCount = 0;
        for(String s : tokens) {
            if(Character.isDigit(s.charAt(0))) {
                stack.push(Integer.parseInt(s));
            } else if(s.charAt(0) == '+' || s.charAt(0) == '-' || 
            s.charAt(0) == '*' || s.charAt(0) == '/') {
                if(signCount == 0) {
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    if(s.charAt(0) == '+') res = n1 + n2;
                    else if(s.charAt(0) == '-') res = n1 - n2;
                    else if(s.charAt(0) == '*') res = n1 * n2;
                    else res = n1 / n2;
                } else {
                    int n1 = stack.pop();
                    if(s.charAt(0) == '+') res += n1;
                    else if(s.charAt(0) == '-') res -= n1;
                    else if(s.charAt(0) == '*') res *= n1;
                    else res /= n1;
                }
                signCount += 1;
            }
        }
        return res;
    }
}
