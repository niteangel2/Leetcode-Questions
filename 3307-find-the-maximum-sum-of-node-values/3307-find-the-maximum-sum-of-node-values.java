class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        // long sum = Arrays.stream(nums).sum();
        // int[] arr = nums.clone();
        // long res = sum;
        // for(int i = 0; i < edges.length;i++) {
        //     int u = edges[i][0];
        //     int v = edges[i][1];
        //     arr[u] = arr[u] ^ k;
        //     arr[v] = arr[v] ^ k;
        //     sum = Arrays.stream(arr).sum();
        //     res = Math.max(sum,res);
        //     arr = nums.clone();
            
        // }
        // return res;

        int n = nums.length;
        Integer [] diff = new Integer[n];
        long sum = 0;
        for(int i = 0;i<n;i++){
            diff[i] = (nums[i]^k)-nums[i];
            sum+=nums[i];
        }
        
        Arrays.sort(diff, Collections.reverseOrder());
        
        for(int i = 0;i<n;i+=2){
            if(i+1 == n) return sum;
            int pair = diff[i]+diff[i+1];
            if(pair>0)sum+=pair;
        }
        return sum;
    }
}