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
    void testTwoSum1() {
        setUp();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};
        int[] actualResult = solution1.twoSum(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }
}
