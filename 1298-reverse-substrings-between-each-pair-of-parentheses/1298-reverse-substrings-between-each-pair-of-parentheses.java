class Solution {
    public void reverse(StringBuilder sb, int start, int end){
         while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(sb.length());
            }
            else if(ch == ')') {
                int start = st.pop();
                reverse(sb, start, sb.length()-1);
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}