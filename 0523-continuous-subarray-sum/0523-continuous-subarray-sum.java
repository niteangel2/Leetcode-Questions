class Solution1 {
    public boolean check(int[] nums, int k, int size) {
        if(size > nums.length) return false;
        long sum = 0;
        for(int i = 0; i < size;i++) {
            sum += nums[i];
        }
        if(sum % k == 0) return true;
        int left = 0;
        int right = size;
        while(right < nums.length) {
            sum -= nums[left];
            sum += nums[right];
            if(sum % k == 0) return true;
            left++;
            right++;
        }
        return false;
    }
    public boolean checkSubarraySum(int[] nums, int k) {
        int size = 2;
        while(size <= nums.length) {
            boolean ans = check(nums,k,size);
            if(ans) return true;
            size++;
        }
        return false;

    }
}

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        int sum = 0;
        remainderIndexMap.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;
            
            if (remainderIndexMap.containsKey(sum)) {
                if (i - remainderIndexMap.get(sum) > 1)  return true;
            } else { 
                remainderIndexMap.put(sum, i);
            }
        }
        return false;

    }
}