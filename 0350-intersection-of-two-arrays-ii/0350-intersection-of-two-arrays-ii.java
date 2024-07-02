class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      ArrayList<Integer> ans=new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                int x=nums1[i];
                ans.add(x);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;
            
            
            
        }
        int[] arr=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            arr[k]=ans.get(k);
        }
        return arr;
    }
}