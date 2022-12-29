package leetcode.editor.en;

// $P2279_MaximumBagsWithFullCapacityOfRocks

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2279 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int result = 0; // Set the Answer as 0
        int capacityLen = capacity.length;
        // Calculate the remaining capacity of each bag and store the results with an array remaining_capacity
        int[] remainCapacity = new int[capacityLen];
        for (int i = 0; i < capacityLen; i++) {
            remainCapacity[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(remainCapacity);
        for (int i = 0; i < capacityLen; i++) {
            if (additionalRocks >= remainCapacity[i]) {
                additionalRocks -= remainCapacity[i];
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
