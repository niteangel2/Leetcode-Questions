class Solution1 {// giving tle
    public int minIncrementForUnique(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        for(int i = 0; i < nums.length;i++) {
            while(set.contains(nums[i])) {
                nums[i]++;
                cnt++;
            }
            set.add(nums[i]);
        }
        return cnt;
    }
}

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int cnt = 0;
        Arrays.sort(nums);
        for(int i = 1;i < nums.length;i++) {
            while(nums[i] == nums[i-1] || nums[i-1] > nums[i]) {
                nums[i] ++;
                cnt++;
            }
        }
        return cnt;
    }
}