class Solution {
    int cnt;
    int K;
    public void solve(int i, int[] nums, HashMap<Integer, Integer> map) {
        if(i >= nums.length) {
            cnt++;
            return;
        }
        solve(i+1, nums, map);

        if(!map.containsKey(nums[i] - K) && !map.containsKey(nums[i] + K)) {
            
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            // System.out.println(map);
            solve(i+1,nums,map);
            int f = map.get(nums[i]);
            f--;
            if(f == 0) map.remove(nums[i]);
            else map.put(nums[i],f);
            // map.put(nums[i], map.getOrDefault(nums[i],0) - 1);
            // System.out.println(map);
        }
    }
    public int beautifulSubsets(int[] nums, int k) {
        cnt = 0;
        K = k;
        HashMap<Integer, Integer> map = new HashMap<>();
        solve(0,nums,map);
        return cnt-1;
    }
}