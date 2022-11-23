package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P26_RemoveDuplicatesFromSortedArray {
    private Solution26 solution26;

    public void setUp() {
        solution26 = new Solution26();
    }

    @Test
    void testExample1_index() {
        setUp();
        int[] nums = {1, 1, 2};
        int expectedResult = 2;
        int actualResult = solution26.removeDuplicates(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_index() {
        setUp();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedResult = 5;
        int actualResult = solution26.removeDuplicates(nums);
        assertEquals(expectedResult, actualResult);
    }
}
