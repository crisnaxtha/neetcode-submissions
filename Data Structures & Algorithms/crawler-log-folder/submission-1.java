class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String str : logs) {
            if("../".equals(str)) {
                if(!stack.isEmpty()) {
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