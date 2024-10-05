class Solution {//TC : O(N)
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int sum = 0;
        for(int i = 0; i < k;i ++) {
            lsum += cardPoints[i];
        }
        sum = lsum;
        int rightIdx = cardPoints.length-1;
        for(int i = k-1; i >= 0;i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rightIdx];
            rightIdx--;
            sum = Math.max(sum,lsum + rsum);
        }
        return sum;
    }
}