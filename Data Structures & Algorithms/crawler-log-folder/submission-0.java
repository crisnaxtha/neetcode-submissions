class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String str : logs) {
            if("../".equals(str)) {
                while(!stack.isEmpty() && stack.size() > 1) {
                    stack.pop();
                }
            } else if("./".equals(str)) {
                continue;
            } else {
                stack.push(str);
            }
        }
        return stack.size();
    }
}