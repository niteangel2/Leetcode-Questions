class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy_arr = arr.clone();
        Arrays.sort(copy_arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < copy_arr.length;i++) {
            if(! map.containsKey(copy_arr[i])) {
                map.put(copy_arr[i],rank);
                rank++;
            }
        }
        int res[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}