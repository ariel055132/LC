package leetcode.editor.en;

// $P136_SingleNumber

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
}
//leetcode submit region end(Prohibit modification and deletion)
