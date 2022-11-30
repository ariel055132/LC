package leetcode.editor.en;

// $P1207_UniqueNumberOfOccurrences

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                int count = hashMap.get(num);
                hashMap.put(num, ++count);
            }
        }

        Set<Integer> set = new HashSet<>(hashMap.values());
        return set.size() == hashMap.keySet().size();

    }
}
//leetcode submit region end(Prohibit modification and deletion)
