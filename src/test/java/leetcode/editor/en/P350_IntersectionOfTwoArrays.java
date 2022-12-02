package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P350_IntersectionOfTwoArrays {
    private Solution350 solution350;

    public void setUp() {
        solution350 = new Solution350();
    }
    @Test
    void testExample1_method1() {
        setUp();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expectedResult = {2, 2};
        int[] actualResult = solution350.intersect(nums1, nums2);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method1() {
        setUp();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expectedResult = {4, 9};
        int[] actualResult = solution350.intersect(nums1, nums2);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample1_method2() {
        setUp();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expectedResult = {2, 2};
        int[] actualResult = solution350.intersect1(nums1, nums2);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method2() {
        setUp();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expectedResult = {9, 4};
        int[] actualResult = solution350.intersect1(nums1, nums2);
        assertArrayEquals(expectedResult, actualResult);
    }
}
