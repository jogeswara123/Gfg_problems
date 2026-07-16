class myStack {
    
    int a[];
    int top=-1;

    public myStack(int n) {
        // Define Data Structures
         a=new int[n];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top==-1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(top==a.length-1){
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
         if (isFull()) {
        }
        else
        a[++top]=x;
        
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (isEmpty()) {
    }
    else
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
         if (isEmpty()) {
            return -1;
        }
        else
        return a[top];
    }
}