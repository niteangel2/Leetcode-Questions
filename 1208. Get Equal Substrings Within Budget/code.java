class Solution {
    public boolean check(int[] diff, int k, int maxCost) {
        int cost = 0;
        for(int i = 0; i < k;i++) {
            cost += diff[i];
        }
        if(cost <= maxCost) return true;
        int l = 0;
        int r = k;
        while(r < diff.length) {
            cost -= diff[l++];
            cost += diff[r++];
            if(cost <= maxCost) return true;
        }
        return false;

    }
    public int equalSubstring(String s, String t, int maxCost) {
        char[] str = s.toCharArray();
        char[] tr = t.toCharArray();
        int[] diff = new int[s.length()];
        for(int i = 0; i < s.length();i++) {
            diff[i] = Math.abs(str[i] - tr[i]);
        }
        int start = 0; 
        int end = diff.length;
        int ans = 0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            boolean res = check(diff,mid,maxCost);
            if(res) {
                ans = Math.max(ans,mid);
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        return ans;
    }
}
