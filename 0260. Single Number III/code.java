class Solution {
    public int[] singleNumber(int[] nums) {
        // if(nums.length<=2)
        //     return nums;
        Arrays.sort(nums);
        // ArrayList<Integer> arr=new ArrayList<Integer>();
         int[] ans=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
                i++;
            else
            {
                // arr.add(nums[i]);
                ans[k]=nums[i];
                k++;
            }
        }
        // // int[] ans=new int[arr.size()];
        // for(int i=0;i<arr.size();i++)
        //     ans[i]=arr.get(i);
        return ans;
    }
}
