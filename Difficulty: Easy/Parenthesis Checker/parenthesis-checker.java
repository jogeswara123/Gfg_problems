class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> a = new Stack<>();
        for(char i:s.toCharArray()){
            if(i==']'){
                if(a.isEmpty()||a.peek()!='['){
                    return false;
                }
                a.pop();
            }
            else if(i=='}'){
                if(a.isEmpty()||a.peek()!='{'){
                    return false;
                }
                a.pop();
            }
            else if(i==')'){
                if(a.isEmpty()||a.peek()!='('){
                    return false;
                }
                a.pop();
            }
            else{
                a.push(i);
            }
        }
        return a.isEmpty();
    }
}
