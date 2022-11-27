package leetcode.editor.en;

// $P14_LongestCommonPrefix

//leetcode submit region begin(Prohibit modification and deletion)
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
