class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations) {
            if(s.equals("+") ) {
                Integer num1 = stack.peek();
                Integer num2 = stack.peek();
                stack.push(num1 + num2);
    
            } else if(s.equals("D")) {
                Integer num1 = stack.peek();
                stack.push(num1 * 2);
            } else if(s.equals("C")) {
                stack.pop();
            } else {
                Integer num = Integer.parseInt(s);
                stack.push(num);
            }
        }

        int res = 0;
        for(Integer num : stack) {
            res += num.intValue();
        }

        return res; 
    }
}