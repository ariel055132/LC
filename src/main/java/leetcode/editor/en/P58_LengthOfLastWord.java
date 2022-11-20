package leetcode.editor.en;

// $P58_LengthOfLastWord

//leetcode submit region begin(Prohibit modification and deletion)
class Solution58 {
    public int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            } else if (s.charAt(i) == ' ' && result != 0) {
                break;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
