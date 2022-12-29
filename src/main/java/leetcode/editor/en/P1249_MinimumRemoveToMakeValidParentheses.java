package leetcode.editor.en;

// $P1249_MinimumRemoveToMakeValidParentheses

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1249 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
            sb.append(s.charAt(i));

        }
        while (!stack.isEmpty()) {
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
