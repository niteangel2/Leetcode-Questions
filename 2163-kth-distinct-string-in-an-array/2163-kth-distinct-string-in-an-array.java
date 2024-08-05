class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        System.out.println(map);
        Set<String> set = new HashSet<>();
        for(int i = 0; i < arr.length;i++) {
            if(set.contains(arr[i])) continue;
            if(map.get(arr[i]) == 1) {
                k--;
                if(k == 0) return arr[i];
             
            }
            set.add(arr[i]);
        }
        return "";
        
    }
}