class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int odd = 0;
        for(Integer x : map.values()) {
            if(x % 2 != 0) odd++;
        }
        if(odd == 0) return s.length();
        return s.length() - odd + 1;
    }
}