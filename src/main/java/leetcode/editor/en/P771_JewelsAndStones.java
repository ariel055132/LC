package leetcode.editor.en;

// $P771_JewelsAndStones

import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                result++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
