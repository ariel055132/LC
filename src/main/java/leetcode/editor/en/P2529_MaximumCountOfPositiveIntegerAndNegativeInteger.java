package leetcode.editor.en;

// $P2529_MaximumCountOfPositiveIntegerAndNegativeInteger

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2529 {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int num : nums) {
            if (num > 0) pos++;
            if (num < 0) neg++;
        }
        return Math.max(pos, neg);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
