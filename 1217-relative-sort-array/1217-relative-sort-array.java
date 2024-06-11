class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Set<Integer> set = new HashSet<>();
        int k = 0;
        Arrays.sort(arr1);
        for(int i = 0; i < arr2.length;i++) {
            for(int j = 0; j < arr1.length;j++) {
                if(arr2[i] == arr1[j]) {
                    res[k++] = arr1[j]; 
                }
            }
            set.add(arr2[i]);
        }
        for(int i = 0; i < arr1.length;i++){
            if(! set.contains(arr1[i])){
                res[k++] = arr1[i];
            }
        }
        return res;
    }
}