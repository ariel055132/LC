package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*  Constraints:
    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -10^9 <= nums1[i], nums2[i] <= 10^9
 */
public class P88_MergeSortedArray {
    private Solution88 solution88;

    void setUp() {
        solution88 = new Solution88();
    }

    @BeforeEach

    @Test
    void testExample1() {
        setUp();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expectedResult = {1,2,2,3,5,6};
        int[] actualResult = solution88.merge1(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expectedResult = {1};
        int[] actualResult = solution88.merge1(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expectedResult = {1};
        int[] actualResult = solution88.merge1(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, actualResult);
    }
}
