package leetcode.editor.en;

// $P350_IntersectionOfTwoArraysII

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution350 {
    // Approach 1: Two Pointers
    // Time Complexity: O(n log n + m log m), where n and m are the lengths of the arrays. (Sort the arrays independently, and then do a linear scan.)
    // Space Complexity: O(log n + log m), depending on the implementation of the sorting algorithm
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

    // Hash Table Approach
    // Assume that length of nums1 < length of nums2
    public int[] intersect1(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect1(nums2, nums1);
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums1) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                int count = hashMap.get(num);
                hashMap.put(num, ++count);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums2) {
            if (hashMap.containsKey(num)) {
                int count = hashMap.get(num);
                if (count > 1) {
                    count--;
                    hashMap.put(num, count);
                } else {
                    hashMap.remove(num);
                }
                arrayList.add(num);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
