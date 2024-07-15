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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < descriptions.length;i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            boolean leftchild = descriptions[i][2] == 1;

            if(!map.containsKey(parent)) {
                map.put(parent, new TreeNode(parent));
            }
            if(! map.containsKey(child)) {
                map.put(child, new TreeNode(child));
            }
            if(leftchild) {
                map.get(parent).left = map.get(child);
            }
            else{
                map.get(parent).right = map.get(child);
            }
            set.add(child);  
        }
        for(TreeNode node : map.values()) {
            if(!set.contains(node.val)) return node;
        }
        return null;
    }
}