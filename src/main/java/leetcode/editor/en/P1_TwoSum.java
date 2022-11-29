package leetcode.editor.en;

// $P1_TwoSum

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {

    // Brute Force
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // Hash Table Approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(nums.length);
        for (int index = 0; index < nums.length; index++) {
            hashMap.put(nums[index], index);
        }
        for (int index = 0; index < nums.length; index++) {
            if (hashMap.get(target - nums[index]) != null && hashMap.get(target - nums[index]) != index) {
                result[0] = index;
                result[1] = hashMap.get(target - nums[index]);
                break;
            } else {
                continue;
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
