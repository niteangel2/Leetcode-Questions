class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        int len = 1;
        while(len <= nums.length) {
            int l = 0;
            int sum = 0;
            for(int i = 0;i < len; i++) {
                sum += nums[i];
            }
            int r = len;
            arr.add(sum);
            while(r < nums.length) {
                sum += nums[r++];
                sum -= nums[l++];
                arr.add(sum);
            }
            len++;
        }
        // System.out.println(arr);
        Collections.sort(arr);
        int res = 0;
        int i = left-1;
        while(i < right) {
            res += arr.get(i);
            res = res % 1000000007;
            i++;
        }
        return res % 1000000007;
    }
}