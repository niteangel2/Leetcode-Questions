class Solution {
    public int divide(int dividend, int divisor) {
        
        int ans=dividend/divisor;
        if(dividend==-2147483648 && divisor==-1)
            return 2147483647;
        if(ans>2147483647)
            return 2147483647;
        if(ans<-2147483648)
            return -2147483648;
        
        return ans;
        
    }
}