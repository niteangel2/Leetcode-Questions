class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans=new ArrayList();
                    List<Integer> arr=new ArrayList();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
                continue;

            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                if(j!=i+1 && nums[j]==nums[j-1]){
                    j++;
                    continue;
                }
                if(k!=nums.length-1 && nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    // arr.add(nums[i]);
                    // arr.add(nums[j]);
                    // arr.add(nums[k]);
                    // ans.add(arr);
                    
                    ans.add(Arrays.asList(nums[i],nums[j++],nums[k]));
                    
                }
                else if(sum<0)
                    j++;
                else
                    k--;
                
            }
           // arr.clear();
        }
        return ans;
    }
}