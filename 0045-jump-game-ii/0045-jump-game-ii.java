class Solution {
    public int jump(int[] nums) {
        Integer dp [] = new Integer[nums.length + 1];
        return find(nums , 0 , dp);
    }
    private int find(int nums[] , int index , Integer[] dp){
        if(index >= nums.length - 1){
            return 0;
        }
        if(dp[index] != null){
            return dp[index];
        }
        int min = 10_000;
        for(int i = index + 1 ; i <= index+nums[index]; i ++){
            min=Math.min(min, 1+find(nums, i , dp));
        }
        return dp[index] = min;
    }
}