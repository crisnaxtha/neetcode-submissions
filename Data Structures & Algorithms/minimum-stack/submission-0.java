class MinStack {
    Stack<Integer> res = new Stack<>();
    Stack<Integer> minV = new Stack<>();
    int min = 0;

    public MinStack() {
        
    }
    
    public void push(int val) {
        res.push(val);
        if(minV.isEmpty() || minV.peek() > val) {
            minV.push(val);
        } else {
            minV.push(minV.peek());
        }
    }
    
    public void pop() {
        res.pop();
        minV.pop();
    }
    
    public int top() {
        return res.peek();
    }
    
    public int getMin() {
        return minV.peek();
    }
}
