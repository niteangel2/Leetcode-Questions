class Solution {
    public int count(int[] nums, int x) {
        int cnt = 0;
        for(int i = 0; i < nums.length;i++) {
            if(nums[i] <= x) cnt++;
        }
        return cnt;
    }
    public int findDuplicate(int[] nums) { // using binary search on answer TC : O(nlogn) SC : O(1)
        int s = 1;
        int e = nums.length;
        while(s < e) {
            int mid = s + (e-s)/2;
            if(count(nums,mid) > mid) e = mid;
            else s = mid+1;
        }
        return s;
    }
}