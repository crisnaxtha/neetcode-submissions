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
    public boolean isBalanced(TreeNode root) {
        return dfs(root) == 1 ? true : false;
    }

    public int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = dfs(root.left) + 1;
        System.out.println("Left " + leftHeight);
        int rightHeight = dfs(root.right) + 1;
        System.out.println("Right " + rightHeight);
        if(leftHeight - rightHeight > 1 || rightHeight - leftHeight > 1) {
           return 0;
        }
        return 1;
    }
}
