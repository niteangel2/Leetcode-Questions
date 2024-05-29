class Solution {
    public int numSteps(String s) {
        int idx = s.length() - 1;
        int cnt = 0;
        int carry = 0;
        while(idx > 0) {
            if(Character.getNumericValue(s.charAt(idx)) + carry == 0) {
                carry = 0;
                cnt++;
            }
            else if(Character.getNumericValue(s.charAt(idx)) + carry == 2) {
                carry = 1;
                cnt++;
            }
            else{
                carry = 1;
                cnt += 2;
            }
            idx--;
        }
        if(carry == 1) cnt++;
        return cnt;
    }
}