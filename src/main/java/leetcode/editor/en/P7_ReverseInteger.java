package leetcode.editor.en;

// $P7_ReverseInteger

//leetcode submit region begin(Prohibit modification and deletion)
class Solution7 {
    public int reverse(int x) {
        int int_max = (int) Math.pow(2, 31);
        int int_min = (int) Math.pow(2, 31);
        int_min *= -1;

        long result = 0;
        int remainder = 0;
        while (x != 0) {
            remainder = x % 10;
            x /= 10;
            result = result * 10 + remainder;
        }
        if (result > int_max || result < int_min) {
            return 0;
        } else {
            return (int) result;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
