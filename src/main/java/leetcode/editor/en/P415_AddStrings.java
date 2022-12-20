package leetcode.editor.en;

// $P415_AddStrings

//leetcode submit region begin(Prohibit modification and deletion)
class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0; // 進位用
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;

        while (num1Index >= 0 || num2Index >= 0 || carry > 0) {
            int sum = 0;
            if (num1Index >= 0) {
                sum += num1.charAt(num1Index) - '0';
                num1Index--;
            }
            if (num2Index >= 0) {
                sum += num2.charAt(num2Index) - '0';
                num2Index--;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            stringBuilder.append(sum);
        }
        return stringBuilder.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
