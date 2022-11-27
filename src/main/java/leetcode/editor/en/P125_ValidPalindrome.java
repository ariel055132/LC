package leetcode.editor.en;

// $P125_ValidPalindrome

//leetcode submit region begin(Prohibit modification and deletion)
class Solution125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while (i < j && !isAlphaNumeric(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphaNumeric(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static Boolean isAlphaNumeric(char s) {
        if (!(s >= 'A' && s <= 'Z') &&
            !(s >= 'a' && s <= 'z') &&
            !(s >= '0' && s <= '9')) {
            return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
