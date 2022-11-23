package leetcode.editor.en;

// $P26_RemoveDuplicatesFromSortedArray

//leetcode submit region begin(Prohibit modification and deletion)
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
