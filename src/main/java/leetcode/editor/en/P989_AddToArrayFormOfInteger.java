package leetcode.editor.en;

// $P989_AddToArrayFormOfInteger

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + k;
            int remainder = sum % 10;
            k = sum / 10;
            result.add(remainder);
        }
        while (k > 0) {
            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
