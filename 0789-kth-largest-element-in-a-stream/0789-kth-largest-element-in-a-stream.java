class KthLargest {
    int K;
    // PriorityQueue<Integer> pq;
    List<Integer> arr;
    public KthLargest(int k, int[] nums) {
        arr = new ArrayList<>();
        for(int i = 0; i < nums.length;i++) {
            arr.add(nums[i]);
        }
        K = k; 
    }
    
    public int add(int val) {
       arr.add(val);
       Collections.sort(arr);
       return arr.get(arr.size()-K);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */