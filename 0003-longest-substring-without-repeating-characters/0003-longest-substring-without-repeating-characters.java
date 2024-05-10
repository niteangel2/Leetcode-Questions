// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() == 0){
//             return 0;
//         }
//         HashSet<Character> set = new HashSet<Character>();
//         int size = 1;
//         for(int i = 0; i < s.length();i++) {
//             char ch = s.charAt(i);
//             if(set.contains(ch)) {
//                 size = Math.max(size,set.size());
//                 set.clear();
            
//             }
//             set.add(ch);
//         }
//         size = Math.max(size,set.size());
//         return size;
//     }
// }



class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int maxSize = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            while (set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            maxSize = Math.max(maxSize, j - i + 1);
        }
        return maxSize;
    }
}
