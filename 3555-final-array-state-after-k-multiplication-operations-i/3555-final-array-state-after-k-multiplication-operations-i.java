class Pair{
    int idx;
    int val;
    Pair(int x, int y) {
        this.idx = x;
        this.val = y;
    }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) ->{
            if(a.val == b.val) {
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.val, b.val);
        });
        for(int i = 0; i < nums.length;i++) {
            pq.add(new Pair(i,nums[i]));
        }
        while(k-- > 0) {
            Pair p = pq.remove();
            int i = p.idx;
            nums[i] = nums[i] * multiplier;
            pq.add(new Pair(i,nums[i])); 
        }
        return nums;

    }
}