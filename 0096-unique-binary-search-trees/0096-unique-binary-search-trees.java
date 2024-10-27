class Solution {
    public int numTrees(int n) {
       // Catalan number : Cn+1 = 2*(2n+1)*Cn/n+2
        long c = 1;
        for(int i = 0; i < n;i ++)
            c = c * 2 * ( 2 * i + 1)/(i+2);
        return (int)c;
    }
}