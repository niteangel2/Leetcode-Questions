class Solution {
    public int pivot(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s < e) {
            int mid = s+(e-s)/2;
            if(nums[mid] >= nums[0]) {
                s = mid+1;
            }
            else {
                e = mid;
            }
        }
        if(nums[0] < nums[s]) return 0;
        return s;
    }
    public int binarySearch(int[] nums, int s, int e,int target) {
        int mid = s + (e-s)/2;
        while(s <= e) {
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int p = pivot(nums);
        int ans = -1;
        if(target >= nums[p] && target <= nums[nums.length-1]) {
            ans = binarySearch(nums,p,nums.length-1,target);
        }
        else{
            ans = binarySearch(nums,0,p-1,target);
        }
        return ans;
    }
}