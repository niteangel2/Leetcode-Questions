class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        int n = Integer.toBinaryString(num).length();
        int m = (1 << n) - 1;
        return num ^ m;
    }
}