class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();

        if(s.length()%2!=0){
            return false;
        }

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            } else if(ch == ')' && !stk.empty() && stk.peek()=='('){
                stk.pop();
            } else if(ch=='}' && !stk.empty() && stk.peek() == '{'){
                stk.pop();
            } else if(ch == ']' && !stk.empty() && stk.peek()=='['){
                stk.pop();
            } else {
                return false;
            }
        }
        return stk.isEmpty();
    }
}
