package leetcode.editor.en;

// $P944_DeleteColumnsToMakeSorted

//leetcode submit region begin(Prohibit modification and deletion)
class Solution944 {
    public int minDeletionSize(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return 0;
        }
        int result = 0;
        int rows = strs.length; // number of rows
        int cols = strs[0].length(); // number of columns
        for (int i = 0; i < cols; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < rows; j++) {
                if (strs[j].charAt(i) < currentChar) {
                    result++;
                    break;
                }
                currentChar = strs[j].charAt(i);
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
