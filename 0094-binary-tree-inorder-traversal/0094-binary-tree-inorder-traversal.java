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
   
    public List<Integer> inorderTraversal(TreeNode root) {
        //if(root == null)
        List<Integer> arr = new ArrayList();
        inorderTraversal(root,arr);
        return arr;
    }
    public void inorderTraversal(TreeNode root,List<Integer> arr ){
        if(root == null)
        return;
        inorderTraversal(root.left,arr);
        arr.add(root.val);
        inorderTraversal(root.right,arr);
    }
}

// iterative solution
class Solution {
   
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return arr;
        TreeNode curr = root;
        while(curr != null || st.size() > 0) {
            while(curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            arr.add(curr.val);
            curr = curr.right;
        }
        return arr;
        
    }
    
}
