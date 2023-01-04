package leetcode.editor.en;

// $P2244_MinimumRoundsToCompleteAllTasks

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2244 {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        // Iterate over the integer in the array, and store the corresponding result in a map
        for (int task : tasks) {
            if (map.containsKey(task)) {
                int count = map.get(task);
                map.put(task, ++count);
            } else {
                map.put(task, 1);
            }
        }

        int result = 0;

        for (int count : map.values()) {
            if (count == 1) {
                return -1;
            }
            if (count % 3 == 0) {
                result += count / 3;
            } else {
                result += count / 3 + 1;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
