class Solution {
    public int[] frequencySort(int[] nums) {
        if(nums.length == 1) return nums;
        int[] freq = new int[201];
        for(int i = 0 ; i < nums.length;i++) {
            if(nums[i] >= 0) {
                freq[nums[i]]++;
            }
            else{
                freq[100 - nums[i]]++;
            }
        }
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for(int i = 0; i < freq.length;i++) {
            if(freq[i] > 0) {
                if(map.containsKey(freq[i])) {
                    map.get(freq[i]).add(i);
                }
                else{
                    map.put(freq[i],new ArrayList<>());
                    map.get(freq[i]).add(i);
                }
            }
        }
        int k = 0;
        for(Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            int i = e.getKey();
            ArrayList<Integer> a = e.getValue();
            for(int j = 0;j < a.size();j++) {
                if(a.get(j) > 100) {
                    a.set(j,100-a.get(j));
                }
            }
            Collections.sort(a,Collections.reverseOrder());
            for(int h = 0; h < a.size();h++) {
                int val = a.get(h);
                for(int x = 0; x < i;x++) {
                    nums[k++] = val;
                }
            }
        }
        return nums;
    }
}