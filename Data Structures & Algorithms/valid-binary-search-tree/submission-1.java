class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftVal = (root.left != null) ? root.left.val : 0;
        int rightVal = (root.right != null) ? root.right.val : 0;
        isValidBST(root.left);
        isValidBST(root.right);
        return leftVal < root.val && rightVal > root.val;
    }
}