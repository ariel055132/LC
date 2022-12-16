package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P238_ProductOfArrayExceptSelf {
    private Solution238 solution238;

    public void setUp() {
        solution238 = new Solution238();
    }

    @Test
    void testExample1_approach1() {
        setUp();
        int[] nums = {1, 2, 3, 4};
        int[] expectedResult = {24, 12, 8, 6};
        int[] actualResult = solution238.productExceptSelf(nums);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_approach1() {
        setUp();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expectedResult = {0, 0, 9, 0, 0};
        int[] actualResult = solution238.productExceptSelf(nums);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample1_approach2() {
        setUp();
        int[] nums = {1, 2, 3, 4};
        int[] expectedResult = {24, 12, 8, 6};
        int[] actualResult = solution238.productExceptSelf1(nums);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_approach2() {
        setUp();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expectedResult = {0, 0, 9, 0, 0};
        int[] actualResult = solution238.productExceptSelf1(nums);
        assertArrayEquals(expectedResult, actualResult);
    }
}
