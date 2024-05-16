class Solution1 {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i = 0; i <= s.length() - 3;i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < i + 3; j++) {
                char ch = s.charAt(j);
                set.add(ch);
            }
            if(set.size() == 3) cnt++;
        }
        return cnt;
    }
}
//exhaustive search
class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i = 0; i <= s.length() - 3;i++) {
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i+2) && s.charAt(i+1) != s.charAt(i+2)) {
                cnt++;
            }
        }
        return cnt;
    }
}
