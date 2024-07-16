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
    TreeNode startNode = null , destNode = null;
    StringBuilder s = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    Map<TreeNode , TreeNode> map = new HashMap<>();
    public String getDirections(TreeNode root, int startValue, int destValue) {
        parentsMap(root , startValue , destValue);
        dfs(startNode , destNode , null);
        return s2.toString();
    }
    void dfs(TreeNode startNode , TreeNode destNode , TreeNode prev){
        if(startNode == destNode) {
            s2=new StringBuilder(s);
            return ;
        }
        if(startNode == null) {
            return ;
        }
        if(prev != startNode.left){
            s.append('L');
            dfs(startNode.left , destNode , startNode);
            s.deleteCharAt(s.length() - 1);
        }
        if(prev != startNode.right){
            s.append('R');
            dfs(startNode.right , destNode , startNode);
            s.deleteCharAt(s.length() - 1);
        }
        if(prev != map.get(startNode)){
            s.append('U');
            dfs(map.get(startNode) , destNode , startNode);
            s.deleteCharAt(s.length() - 1);
        }
    }
    void parentsMap(TreeNode root , int start , int end){
        if(root == null) return ;
        if(root.val == start) startNode = root;
        if(root.val == end) destNode = root;
        if(root.left != null){
            parentsMap(root.left , start , end);
            map.put(root.left , root);
        }
        if(root.right != null) {
            parentsMap(root.right , start , end);
            map.put(root.right , root);
        }
    }
}