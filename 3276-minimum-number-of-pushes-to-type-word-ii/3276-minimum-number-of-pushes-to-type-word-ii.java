class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr, Collections.reverseOrder());
        int res = 0;
        for(int i = 0; i < arr.size();i++) {
            if(i <= 7){
                res += arr.get(i);
            }
            else if(i > 7 && i <= 15) {
                res += (2 * arr.get(i));
            }
            else if(i > 15 && i <= 23) {
                res += (3 * arr.get(i));
            }
            else{
                res += (4 * arr.get(i));
            }
        }
        return res;
    }
}