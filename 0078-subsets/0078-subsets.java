class Solution1 {
    List<List<Integer>> res = new ArrayList<>();
    public void solve(int[] nums,int i,List<Integer> arr) {
        if(i == nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }
         arr.add(nums[i]);
        solve(nums,i+1,arr);
        arr.remove(arr.size()-1);
        solve(nums,i+1,arr);
        
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        solve(nums,0,arr);
        return res;
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i : nums) {
            int n = res.size();
            for(int j = 0; j < n; j ++) {
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(i);
                res.add(temp);
            }
        }
        return res;
    }
}