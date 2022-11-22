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

    // 1. Read the String jewels and build the corresponding hash set.
    // 2. Read the String stones and count the results.
    public int numJewelsInStones1(String jewels, String stones) {
        int result = 0;
        HashSet<Character> hashset = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            hashset.add(jewel);
        }
        for (char stone : stones.toCharArray()) {
            if (hashset.contains(stone)) {
                result++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
