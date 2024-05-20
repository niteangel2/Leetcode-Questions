class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    int n = nums.length;
    int powSize = (int) Math.pow(2, n);

    for (int i = 0; i < powSize; i++) {
      List<Integer> val = new ArrayList<>();

      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) != 0) {
          val.add(nums[j]);
        }
      }
      result.add(val);
    }

    return result;
  }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = subsets(nums);
        int sum = 0;
        int xor = 0;
        for(int i = 0; i < res.size();i++) {
            xor = 0;
            for(int j = 0; j < res.get(i).size();j++) {
                xor ^= res.get(i).get(j);
            }
            sum += xor;
        }
        return sum;
    }
}