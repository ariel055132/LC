package leetcode.editor.en;

// $P1150_CheckIfANumberIsMajorityElementInASortedArray

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1150 {
    // Approach 1: Hash Table
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isMajorityElement(int[] nums, int target) {
        int majorityCount = nums.length / 2;
        int majorityIndex = 0;
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int num : nums) {
            if (hashtable.containsKey(num)) {
                int count = hashtable.get(num);
                hashtable.put(num, ++count);
            } else {
                hashtable.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashtable.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityIndex = entry.getKey();
            }
        }
        return majorityIndex == target;
    }

    // Apporach 2: Binary Search
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isMajorityElement1 (int[] nums, int target) {
        int first = search(nums, target);
        int last = search(nums, target + 1);
        return last - first > nums.length / 2;
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
