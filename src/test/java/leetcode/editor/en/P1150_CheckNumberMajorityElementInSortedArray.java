package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1150_CheckNumberMajorityElementInSortedArray {
    private Solution1150 solution1150;

    public void setUp() {
        solution1150 = new Solution1150();
    }

    @Test
    @DisplayName("Positive Test Case (Approach 1: HashMap)")
    void testExample1_approach1() {
        setUp();
        int[] nums = {2, 4, 5, 5, 5, 5, 5, 6, 6};
        int target = 5;
        boolean expectedResult = true;
        boolean actualResult = solution1150.isMajorityElement(nums, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Negative Test Case (Approach 1: HashMap)")
    void testExample2_approach1() {
        setUp();
        int[] nums = {10, 100, 101, 101};
        int target = 101;
        boolean expectedResult = false;
        boolean actualResult = solution1150.isMajorityElement(nums, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Positive Test Case of approach 2 Binary Search")
    void testExample1_approach2() {
        setUp();
        int[] nums = {2, 4, 5, 5, 5, 5, 5, 6, 6};
        int target = 5;
        boolean expectedResult = true;
        boolean actualResult = solution1150.isMajorityElement1(nums, target);
        assertEquals(expectedResult, actualResult);
    }
}
