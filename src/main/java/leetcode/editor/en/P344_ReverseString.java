package leetcode.editor.en;

// $P344_ReverseString

//leetcode submit region begin(Prohibit modification and deletion)
class Solution344 {
    public void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        while (leftIndex < rightIndex) {
            char tmp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = tmp;
            leftIndex++;
            rightIndex--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
