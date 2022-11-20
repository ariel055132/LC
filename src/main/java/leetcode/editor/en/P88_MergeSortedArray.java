package leetcode.editor.en;

// $P88_MergeSortedArray

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    public int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
