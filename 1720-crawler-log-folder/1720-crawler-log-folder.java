class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(int i = 0; i < logs.length;i++) {
            String s = logs[i];
            if(s.length() == 2 && s.charAt(0) == '.') {
                continue;
            }
            if(s.length() == 3 && s.charAt(0) == '.') {
                if(! st.isEmpty()) st.pop();
                continue;
            }
            st.push(s);
            
        }
        return st.size();
    }
}