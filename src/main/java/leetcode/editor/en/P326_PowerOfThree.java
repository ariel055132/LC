package leetcode.editor.en;

// $P326_PowerOfThree

//leetcode submit region begin(Prohibit modification and deletion)
class Solution326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
