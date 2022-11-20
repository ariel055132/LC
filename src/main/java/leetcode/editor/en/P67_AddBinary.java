package leetcode.editor.en;

// $P67_AddBinary

//leetcode submit region begin(Prohibit modification and deletion)
class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        while (aIndex >= 0 || bIndex >= 0) {
            int sum = 0;
            if (aIndex >= 0) {
                sum += a.charAt(aIndex) - '0';
                aIndex--;
            }
            if (bIndex >= 0) {
                sum += b.charAt(bIndex) - '0';
                bIndex--;
            }
            sum += carry;
            if (sum > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            result.append(sum % 2);
        }
        if (carry != 0) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
