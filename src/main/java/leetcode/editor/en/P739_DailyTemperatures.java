package leetcode.editor.en;

// $P739_DailyTemperatures

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
