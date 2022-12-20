package leetcode.editor.en;

// $P371_SumOfTwoIntegers

//leetcode submit region begin(Prohibit modification and deletion)
class Solution371 {
    public int getSum(int a, int b) {
        while(b != 0) {
            int carry = (a & b) << 1;
            a = a^b;
            b = carry;
        }
        return a;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
