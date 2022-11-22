package leetcode.editor.en;

// $P202_HappyNumber

import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution202 {
    public boolean isHappy(int n) {
       Set<Integer> set = new HashSet<>();
       while (n > 0) {
           n = helper(n);
           if (n == 1) {
               return true;
           }
           if (set.contains(n)) {
               return false;
           }
           set.add(n);
       }
       return false;
    }

    public int helper(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
