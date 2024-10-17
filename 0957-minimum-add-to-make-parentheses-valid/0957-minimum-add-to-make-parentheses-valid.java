class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0) return 0;
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for(int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(ch);
            }
            else if(!st.isEmpty() && ch == ')') {
                st.pop();
            }
            else cnt++;

        }
        return cnt + st.size();

    }
}