package leetcode.editor.en;

import java.util.Stack;

// $P1544_MakeTheStringGreat
/* Example
   input: "abBAcC"
   "a"
   "ab"
   "abB" --> delete bB --> "a"
   "aA"  --> delete aA --> ""
   "c"
   "cC"  --> delete cC --> ""
   return ""
* */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution1544 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // 32 is obtained from print out the result of minus b from B.
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32 ) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
