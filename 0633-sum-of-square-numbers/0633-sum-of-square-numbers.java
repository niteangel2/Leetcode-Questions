class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (int)(Math.sqrt(c));
        while(i <= j)
        {
            long t = i*i+j*j;
            if(t == c)
            {
                return true;
            }
            else if(t > c) j--;
            else i++;
        }
        return false;
    }
}