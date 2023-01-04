package leetcode.editor.en;

// $P520_DetectCapital

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution520 {
    public boolean detectCapitalUse(String word) {
        boolean condition1 = true;
        boolean condition2 = true;
        boolean condition3 = true;
        // All Capital
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                condition1 = false;
                break;
            }
        }
        if (condition1) {
            return true;
        }

        // All letters are not capitals
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                condition2 = false;
                break;
            }
        }
        if (condition2) {
            return true;
        }
        // First letter is capital
        if (!Character.isUpperCase(word.charAt(0))) {
            condition3 = false;
        }
        if (condition3) {
            for (int i = 1; i < word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    condition3 = false;
                    break;
                }
            }
        }

        if (condition3) {
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
