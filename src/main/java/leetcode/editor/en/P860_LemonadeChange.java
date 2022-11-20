package leetcode.editor.en;

// $P860_LemonadeChange

//leetcode submit region begin(Prohibit modification and deletion)
class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                five--;
                ten++;
            } else { // else if (bills[i] == 20)
                if (ten > 0) { // if have 10, return 10 + 5 first
                    ten--;
                    five--;
                } else { // else return five for three times
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
