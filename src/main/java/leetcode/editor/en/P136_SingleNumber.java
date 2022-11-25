package leetcode.editor.en;

// $P136_SingleNumber

import java.util.Set;
import java.util.Hashtable;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution136 {
    // Bit Opeartion to pass the requirements of questions
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }


    // Apporach 2: Hash Table
    // 1. Itearte through all elements in nums and set up key/value pair.
    // 2. Return the element which appeared only once.
    // Time & Space Complexity: O(n)
    public int singleNumber1(int[] nums) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        for (int num : nums) {
            if (hashtable.containsKey(num)) {
                hashtable.remove(num);
            } else {
                hashtable.put(num, 1);
            }
        }
        Set<Integer> keys = hashtable.keySet();
        for (int key : keys) {
            return key;
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
