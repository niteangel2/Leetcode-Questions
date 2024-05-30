class Solution {
    public int countTriplets(int[] arr) {
        int cnt = 0;
      //we are doing xor for index i to k and checking whether it is becoming zero or not
        for(int i = 0; i < arr.length;i++) {
            int xor = arr[i];
            for(int k = i + 1; k < arr.length;k++) {
                xor ^= arr[k];
                if(xor == 0) {
                    cnt += (k-i);
                }
            }
        }
        return cnt;
    }
}
