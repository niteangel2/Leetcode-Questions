//exhaustive search with incremental update 
//tc: O(n)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < k ; i++){
            sum += nums[i];
        }
        avg = sum/k;
        max = Math.max(avg,max);
        int left = 0;
        int right = k;
        while(right < nums.length) {
            sum = sum-nums[left++];
            sum = sum + nums[right++];
            avg = sum/k;
            max = Math.max(avg,max);

        }
        return max;
    }
}