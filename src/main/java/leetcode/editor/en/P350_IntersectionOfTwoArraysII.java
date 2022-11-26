package leetcode.editor.en;

// $P350_IntersectionOfTwoArraysII

import java.util.ArrayList;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int nums1Index = 0; int nums2Index = 0;
        while (nums1Index < nums1.length && nums2Index < nums2.length) {
            if (nums1[nums1Index] < nums2[nums2Index]) {
                nums1Index++;
            } else if (nums1[nums1Index] > nums2[nums2Index]) {
                nums2Index++;
            } else {
                arrayList.add(nums1[nums1Index]);
                nums1Index++;
                nums2Index++;
            }
        }
        int[] result = new int[arrayList.size()];
        int k = 0;
        while (k < arrayList.size()) {
            result[k] = arrayList.get(k);
            k++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
