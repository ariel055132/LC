package leetcode.editor.en;

// $P1630_ArithmeticSubarrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            Boolean tmpResult = true;
            int startIndex = l[i];
            int endIndex = r[i];
            int[] temp = new int[endIndex - startIndex + 1];

            // Copy elements
            for (int index = 0; startIndex <= endIndex; index++) {
                temp[index] = nums[startIndex];
                startIndex++;
            }

            Arrays.sort(temp);
            int diff = temp[1] - temp[0];
            for (int k = 1; k < temp.length; k++) {
                if ((temp[k] - temp[k-1]) != diff) {
                    tmpResult = false;
                    break;
                }
            }
            result.add(tmpResult);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
