package leetcode.editor.en;

// $P144_BinaryTreePreorderTraversal

//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nums = preOrder(root, new ArrayList<Integer>());
        return nums;
    }
    // PreOrder Traversal --> VLR
    public ArrayList<Integer> preOrder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return arr;
        }
        arr.add(root.val);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
