class Pair{
    int sum;
    int cnt;
    Pair(int sum,int cnt) {
        this.sum = sum;
        this.cnt = cnt;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class LeetDaily02 {
    int count = 0;
   public Pair average(TreeNode root) {
       if(root == null) {
           return new Pair(0,0);
       }
       
       Pair left = average(root.left);
       Pair right = average(root.right);
       
       int s = root.val + left.sum+right.sum;
       int c = left.cnt + right.cnt + 1;
       if(c == 0){
           
       }
       else if( root.val == s/c) {
           count++;
       }
       return new Pair(s,c);
   }
   public int averageOfSubtree(TreeNode root) {
       Pair num = average(root);
       return count;
   }

}