package leetcode.editor.en;

// $P169_MajorityElement

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution169 {
    // Approach 1: Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (num == elem) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    // Approach 2: Hash Table
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int majorityElement1(int[] nums) {
        int result = 0;
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!hashmap.containsKey(num)) {
                hashmap.put(num, 1);
            } else {
                int count = hashmap.get(num);
                hashmap.put(num, ++count);
            }
            if (hashmap.get(num) > nums.length / 2) {
                result = num;
                break;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
