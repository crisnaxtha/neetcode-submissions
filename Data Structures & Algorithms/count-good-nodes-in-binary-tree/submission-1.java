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
    public int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root, root.val));
        int count = 0;
        
        while(!q.isEmpty()) {
            int qSize = q.size();
            for(int i = 0; i < qSize; i++) {
                Pair<TreeNode, Integer> current = q.poll();
                TreeNode temp = current.getKey();
                int maxSoFar = current.getValue();
                
                if(temp != null) {
                    if(temp.val >= maxSoFar) {
                        count++;
                    }
                    int nextMax = Math.max(maxSoFar, temp.val);
                    if(temp.left != null) q.offer(new Pair<>(temp.left, nextMax));
                    if(temp.right != null) q.offer(new Pair<>(temp.right, nextMax));
                }
            }
        }
        return count;
    }
}