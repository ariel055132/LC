package leetcode.editor.en;

// $P151_ReverseWordsInAString

//leetcode submit region begin(Prohibit modification and deletion)
class Solution151 {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.trim().split("\\s+");
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i != 0) stringBuilder.append(strings[i] + " " );
            if (i == 0) stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
