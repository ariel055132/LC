package leetcode.editor.en;

// $P2114_MaximumNumberOfWordsFoundInSentences

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        int result = 1; // at least one word can be found in sentence
        for (int i = 0; i < sentences.length; i++) {
            int tmp = 1;
            String sentence = sentences[i];
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    tmp++;
                }
            }
            result = Math.max(tmp, result);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
