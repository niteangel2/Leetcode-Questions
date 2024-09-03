class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for(char ch : s.toCharArray()) {
            str += Integer.toString(ch - 'a' + 1);
        }
        while(k-- > 0) {
            int sum = 0;
            for(char ch : str.toCharArray()) {
                sum += ch - '0';
            }
            str = Integer.toString(sum);
        }
        return Integer.parseInt(str);
    }
}