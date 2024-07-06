class Solution {
    public int passThePillow(int n, int time) {
        int full = time / (n-1);
        int etime = time % (n-1);

        if(full % 2 == 0) {
            return etime+1;
        }
        else return n-etime;
    }
}