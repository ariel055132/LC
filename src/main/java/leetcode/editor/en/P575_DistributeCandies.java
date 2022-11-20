package leetcode.editor.en;


import java.util.HashMap;

// $P575_DistributeCandies

//leetcode submit region begin(Prohibit modification and deletion)
class Solution575 {
    public int distributeCandies(int[] candyType) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < candyType.length; i++) {
            if (!hashMap.containsKey(candyType[i])) {
                hashMap.put(candyType[i], 1);
                result++;
            }

            if (result == candyType.length / 2) {
                return result;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
