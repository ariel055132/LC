package leetcode.editor.en;

// $P230_KthSmallestElementInABST

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
class Solution {
    private int counter = 0;
    private int result = -1; // final result

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraverse(root, k);
        return result;
    }

    private void inOrderTraverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.left, k);
        if (++counter == k) {
            result = root.val;
            return;
        }
        inOrderTraverse(root.right, k);
    }

}
//leetcode submit region end(Prohibit modification and deletion)
