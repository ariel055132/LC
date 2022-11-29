package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1_TwoSum {

    private Solution1 solution1;

    public void setUp() {
        solution1 = new Solution1();
    }

    @Test
    void testExample1_method1() {
        setUp();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution1.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method1() {
        setUp();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expectedResult = {1, 2};
        int[] actualResult = solution1.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3_method1() {
        setUp();
        int[] nums = {3, 3};
        int target = 6;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution1.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample1_method2() {
        setUp();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution1.twoSum1(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method2() {
        setUp();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expectedResult = {1, 2};
        int[] actualResult = solution1.twoSum1(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3_method3() {
        setUp();
        int[] nums = {3, 3};
        int target = 6;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution1.twoSum1(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }
}
