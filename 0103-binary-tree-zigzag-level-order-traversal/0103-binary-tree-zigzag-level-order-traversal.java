/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.add(root);
       // q.add(null);
        while(! q.isEmpty()) {
           int size = q.size();
          //  List<Integer> arr = new ArrayList<>(size);
          Integer[] arr = new Integer[size];
            for(int i = 0; i < size;i++){
                TreeNode curr = q.poll();
                int idx = flag ? i : size-i-1;
                arr[idx] = curr.val;

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            flag = !flag;
            ans.add(Arrays.asList(arr));
        }
        return ans;
    }
}
            
          



