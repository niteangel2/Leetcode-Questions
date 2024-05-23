class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean primes[] = new boolean[right + 1];
        Arrays.fill(primes,true);
        primes[0] = primes[1] = false;
        for(int i = 2;i*i < primes.length;i++) {
            if(primes[i])
            for(int j = i*i; j < primes.length;j+=i) {
                if(j % i == 0) primes[j] = false;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < primes.length;i++) {
            if(primes[i]) arr.add(i);
        }
        int min = Integer.MAX_VALUE;
        int first = -1;
        int sec = -1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > right) break;
            if(arr.get(i-1) >= left && arr.get(i-1) <= right && arr.get(i) >= left && arr.get(i) <= right){
                int diff = arr.get(i) - arr.get(i-1);
                if(diff < min) {
                    min = diff;
                    first = arr.get(i-1);
                    sec = arr.get(i);
                }
            }
            
        }
        return new int[]{first,sec};
    }
}