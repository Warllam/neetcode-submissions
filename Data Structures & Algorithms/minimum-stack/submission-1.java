class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
    }
    
    public void pop() {
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return Collections.min(stack);
    }
}
