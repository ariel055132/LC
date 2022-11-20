package leetcode.editor.en;

// $P896_MonotonicArray

//leetcode submit region begin(Prohibit modification and deletion)
class Solution896 {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                increase = false;
            }
            if (nums[i] > nums[i-1]) {
                decrease = false;
            }
            if (increase == false && decrease == false) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
