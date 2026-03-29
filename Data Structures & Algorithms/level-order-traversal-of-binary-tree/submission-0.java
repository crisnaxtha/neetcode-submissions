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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int qLen = q.size();
            List<Integer> innerList = new ArrayList<>();
            for(int i = 0; i < qLen; i++) {
                TreeNode temp = q.poll();
                if(temp != null) {
                    innerList.add(temp.val);
                    q.offer(temp.left);
                    q.offer(temp.right);
                }
            }
            if(innerList.size() != 0) res.add(innerList);
            
        }
        return res;
    }
}
