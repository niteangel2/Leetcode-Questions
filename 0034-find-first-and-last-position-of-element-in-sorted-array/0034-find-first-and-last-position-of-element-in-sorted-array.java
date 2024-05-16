class Solution {
    public int first(int[] nums,int n, int target){
            int s=0;
        int e=n-1;
        int mid= s+(e-s)/2;
        int ans=-1;
        while(s<=e)
        {
            if(nums[mid]==target)
            {
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]>target)
                e=mid-1;
            else
                s=mid+1;
            mid= s+(e-s)/2;
        }
        return ans;
    }
      public int last(int[] nums,int n, int target){
        int s=0;
        int e=n-1;
        int mid= s+(e-s)/2;
        int ans=-1;
        while(s<=e)
        {
            if(nums[mid]==target)
            {
                ans=mid;
                s=mid+1;
            }
            else if(nums[mid]>target)
                e=mid-1;
            else
                s=mid+1;
            mid= s+(e-s)/2;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = first( nums, n,target);
        ans[1] = last( nums, n,target);
        return ans;
    }
}