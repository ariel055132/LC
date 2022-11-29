package leetcode.editor.en;

// $P15_ThreeSum

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        int index = 0;
        while (index < nums.length) {
            if (nums[index] > 0) {
                break;
            }
            int left = index + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum3 = nums[index] + nums[left] + nums[right];
                if (sum3 == 0) {
                    res.add(Arrays.asList(nums[index], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum3 < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            index++;
        }
        return new ArrayList<>(res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
