package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P56_MergeIntervals {
    private Solution56 solution56;

    void setUp() {
        solution56 = new Solution56();
    }
    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15, 18}};
        int[][] expectedResult = {{1,6},{8,10},{15,18}};
        int[][] actualResult = solution56.merge(intervals);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[][] intervals = {{1,4}, {4,5}};
        int[][] expectedResult = {{1,5}};
        int[][] actualResult = solution56.merge(intervals);
        assertArrayEquals(expectedResult, actualResult);
    }
}
