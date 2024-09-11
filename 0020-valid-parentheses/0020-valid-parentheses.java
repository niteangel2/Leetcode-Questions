class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1)
        return false;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(! st.isEmpty() && ch == ')' && st.peek() == '('){
                st.pop();
            }
            else if(! st.isEmpty() && ch == '}' && st.peek() == '{'){
                st.pop();
            }
            else if(! st.isEmpty() && ch == ']' && st.peek() == '['){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}