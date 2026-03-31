class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length <= 3) return 0;
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int signCount = 0;
        for(String s : tokens) {
            if(Character.isDigit(s.charAt(0))) {
                stack.push(Integer.parseInt(s));
                System.out.println("Stack Peek"+ stack.peek());
            } else if(s.charAt(0) == '+' || s.charAt(0) == '-' || 
            s.charAt(0) == '*' || s.charAt(0) == '/') {
               
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    if(s.charAt(0) == '+') stack.push(n2 + n1);
                    else if(s.charAt(0) == '-') stack.push(n2 - n1);
                    else if(s.charAt(0) == '*') stack.push(n2 * n1 );
                    else stack.push(n2 / n1 );
                System.out.println("Stack Peek Sign"+ stack.peek());
            }
        }
        return stack.peek();
    }
}
