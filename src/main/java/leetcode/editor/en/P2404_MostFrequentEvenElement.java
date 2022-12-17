package leetcode.editor.en;

// $P2404_MostFrequentEvenElement

import java.util.Arrays;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution2404 {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int ans = -1;
        int maxFreq = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                if (hashMap.containsKey(num)) {
                    int count = hashMap.get(num);
                    count++;
                    hashMap.put(num, count);
                } else {
                    hashMap.put(num, 1);
                }
            }
        }
        System.out.println(Arrays.asList(hashMap));

        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) > maxFreq) {
                maxFreq = hashMap.get(num);
                ans = num;
            } else if (hashMap.get(num) == maxFreq && ans > num) {
                ans = num;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
