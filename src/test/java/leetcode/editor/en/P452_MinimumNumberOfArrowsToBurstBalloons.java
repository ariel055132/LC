package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P452_MinimumNumberOfArrowsToBurstBalloons {
    private Solution452 solution452;

    public void setUp() {
        solution452 = new Solution452();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int expectedResult = 2;
        int actualResult = solution452.findMinArrowShots(points);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int expectedResult = 4;
        int actualResult = solution452.findMinArrowShots(points);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3")
    void testExample3() {
        setUp();
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int expectedResult = 2;
        int actualResult = solution452.findMinArrowShots(points);
        assertEquals(expectedResult, actualResult);
    }
}
