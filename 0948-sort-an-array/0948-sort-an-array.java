class Solution {
    public void merge(int[] nums,int l, int m,int r) {
        //sizes of two array
        int n1 = m-l+1;
        int n2 = r-m;

        //creating left array and right array
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copying data
        for(int i = 0;i < n1;i++){
            L[i] = nums[l+i];
        }
        for(int i = 0; i < n2;i++){
            R[i] = nums[m+i+1];
        }
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums[k++] = L[i++]; 
            }
            else{
                nums[k++] = R[j++];
            }
        }
        while(i < n1){
           nums[k++] = L[i++]; 
        }
        while(j < n2){
            nums[k++] = R[j++];
        }
    }
    public void mergeSort(int[] nums,int l,int r) {
        if(l >= r){
            return;
        }
        int mid = l + (r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}