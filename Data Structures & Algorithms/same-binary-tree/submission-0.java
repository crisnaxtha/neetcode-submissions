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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty() && !q2.isEmpty()) {
            for(int i = q1.size(); i > 0; i--) {
                TreeNode p1 = q1.poll();
                TreeNode p2 = q2.poll();

                if(p1 == null && p2 == null) {
                    continue;
                }

                if(p1 == null || p2 == null || p1.val != p2.val) {
                    return false;
                }

                q1.offer(p1.left);
                q1.offer(p1.right);
                q2.offer(p2.left);
                q2.offer(p2.right);
            }
        }
        return true;
    }
}
