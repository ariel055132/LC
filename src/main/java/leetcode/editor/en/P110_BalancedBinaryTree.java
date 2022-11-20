package leetcode.editor.en;

// $P110_BalancedBinaryTree

//leetcode submit region begin(Prohibit modification and deletion)

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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else if (Math.abs(height(root.left) - height(root.right)) > 1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSubTree = height(root.left);
        int rightSubTree = height(root.right);
        return Math.max(leftSubTree, rightSubTree) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
