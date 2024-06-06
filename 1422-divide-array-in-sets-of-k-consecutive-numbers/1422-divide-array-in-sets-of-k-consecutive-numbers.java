class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        Arrays.sort(nums);
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i < nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        for(int num : nums) {
            if(map.get(num) == 0) continue;
            for(int i = 0; i < k; i++) {
                int curr = num + i;
                if(!map.containsKey(curr) || map.get(curr) == 0) return false;
                map.put(curr, map.get(curr)-1);
            }
            
        }
        return true;
    }
}