package leetcode.editor.en;

// $P2011_FinalValueOfVariableAfterPerformingOperations

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                result++;
            } else if (op.equals("--X") || op.equals("X--")) {
                result--;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
