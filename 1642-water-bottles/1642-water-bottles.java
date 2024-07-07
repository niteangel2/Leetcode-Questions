class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt = numBottles;
        while(numBottles >= numExchange) {
            int x = numBottles / numExchange;
            int rem = numBottles % numExchange;
            cnt += x;
            numBottles = x + rem;
        }
        return cnt;
    }
}