class SpecialStack {
    
    Stack<Integer> s1;
    Stack<Integer> s2;
    public SpecialStack() {
        // Define Stack
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        if(s2.isEmpty()||s2.peek()>=x){
            s2.push(x);
        }
        s1.push(x);
    }

    public void pop() {
        // Remove the top element from the Stack
        if(s1.peek()==s2.peek()){
            s2.pop();
        }
        s1.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(isEmpty()){
            return -1;
        }
       return s1.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return s1.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(s2.isEmpty()){
            return -1;
        }
       return s2.peek();
    }
}