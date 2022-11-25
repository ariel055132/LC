package leetcode.editor.en;

// $P1528_ShuffleString

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
