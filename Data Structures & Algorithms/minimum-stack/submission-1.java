class MinStack {
    Stack<Integer> res = new Stack<>();
    Stack<Integer> minStk = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        res.push(val);
        if(minStk.isEmpty() || minStk.peek() > val) {
            minStk.push(val);
        } else {
            minStk.push(minStk.peek());
        }
    }
    
    public void pop() {
        res.pop();
        minStk.pop();
    }
    
    public int top() {
        return res.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}
