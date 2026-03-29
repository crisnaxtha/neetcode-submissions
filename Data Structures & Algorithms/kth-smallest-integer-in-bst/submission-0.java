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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int qSize = q.size();
            for(int i = 0; i < qSize; i++) {
                TreeNode temp = q.poll();
                if(temp != null) {
                    list.add(temp.val);
                    q.offer(temp.left);
                    q.offer(temp.right);
                }
            }
        }
        Integer[] arr = list.toArray(new Integer[0]);
        Arrays.sort(arr);
        return arr[k-1];
    }
}
