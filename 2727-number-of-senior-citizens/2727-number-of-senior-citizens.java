class Solution {
    public int countSeniors(String[] details) {
        String str = "";
        int cnt = 0;
        for(int i = 0; i < details.length;i++) {
            str = details[i];
            String s = "" + str.charAt(11) + str.charAt(12);
            if(Integer.valueOf(s) > 60) cnt++;
        }
        return cnt;
    }
}