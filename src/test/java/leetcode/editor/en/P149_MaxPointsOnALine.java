package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P149_MaxPointsOnALine {
    private Solution149 solution149;

    public void setUp() {
        solution149 = new Solution149();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        int expectedResult = 3;
        int actualResult = solution149.maxPoints(points);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int expectedResult = 4;
        int actualResult = solution149.maxPoints(points);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test with individual input")
    void testExample3() {
        setUp();
        int[][] points = {{1, 1}};
        int expectedResult = 1;
        int actualResult = solution149.maxPoints(points);
        assertEquals(expectedResult, actualResult);
    }
}
