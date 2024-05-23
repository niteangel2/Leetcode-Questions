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

 // recursive solution
class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> arr = new ArrayList();
        preorderTraversal(root,arr);
        return arr;
    }
    public void preorderTraversal(TreeNode root,List<Integer> arr) {
        if(root == null)
        return;
        arr.add(root.val);
        preorderTraversal(root.left,arr);
        preorderTraversal(root.right,arr);
        
    }
}

// iterative solution

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList();
        if(root == null) return arr;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(! st.isEmpty()) {
            TreeNode curr = st.pop();
            arr.add(curr.val);
            if(curr.right != null) {
                st.push(curr.right);
            }
            if(curr.left != null) {
                st.push(curr.left);
            }
        }
       return arr;
        
    }
}
