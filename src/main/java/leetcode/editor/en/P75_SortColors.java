package leetcode.editor.en;

// $P75_SortColors

//leetcode submit region begin(Prohibit modification and deletion)
class Solution75 {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } if (num == 1) {
                 oneCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                nums[i] = 0;
                zeroCount--;
            } else if (oneCount > 0) {
                nums[i] = 1;
                oneCount--;
            } else {
                nums[i] = 2;
            }
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)
