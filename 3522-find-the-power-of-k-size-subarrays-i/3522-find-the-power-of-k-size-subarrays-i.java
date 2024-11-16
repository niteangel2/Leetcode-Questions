class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if( k == 1) return nums;
        int[] res = new int[nums.length-k+1];
        Arrays.fill(res,-1);
        int cnt = 1;
        int l = 0;
        int r = 1;
        while(r < nums.length) {
            if(nums[l] + 1 == nums[r]) {
                cnt++;
            }
            else{
                cnt = 1;
            }
            if(cnt >= k){
                res[l-k+2] = nums[r];
            }
            l++;
            r++;
        }
        return res;
    }
}