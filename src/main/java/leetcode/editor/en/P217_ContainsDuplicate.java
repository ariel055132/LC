package leetcode.editor.en;

// $P217_ContainsDuplicate

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
