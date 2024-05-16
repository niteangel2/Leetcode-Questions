class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int k = minutes;
        int gain = 0;
        for(int i = 0; i < k;i++) {
            gain += ((grumpy[i] == 1) ? customers[i] : 0);
        }
        int maxgain = gain;
        int left = 0;
        int right = k;
        while(right < n) {
            gain += ((grumpy[right] == 1) ? customers[right] : 0);
            gain -= ((grumpy[left] == 1) ? customers[left] : 0);
            left++;
            right++;
           // System.out.println(gain);
            maxgain = Math.max(gain,maxgain);
        }
        int res = maxgain;
        for(int i = 0;i < n; i++) {
            if(grumpy[i] == 0) res += customers[i];
        }
        return res;
    }
}