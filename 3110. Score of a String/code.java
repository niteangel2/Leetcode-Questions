class Solution {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i = 0;i < s.length()-1;i++) {
            cnt += (Math.abs(arr[i] - arr[i+1]));
        }
        return cnt;
    }
}
