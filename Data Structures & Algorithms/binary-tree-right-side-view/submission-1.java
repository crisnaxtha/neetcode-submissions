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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int qSize = q.size();
            System.out.println(qSize);
            for(int i = 0; i < qSize; i++) {
                TreeNode temp = q.poll();
                if(temp != null) {
                    if(i == qSize - 1) {
                        list.add(temp.val);
                    }
                    q.offer(temp.left);
                    q.offer(temp.right);
                }
            }
        }
        return list;
    }
}
