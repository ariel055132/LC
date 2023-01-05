package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P973_KClosestPointsToOrigin {
    private Solution973 solution973;

    public void setUp() {
        solution973 = new Solution973();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        int[][] expectedResult = {{-2, 2}};
        int[][] actualResult = solution973.kClosest(points, k);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] expectedResult = {{3, 3}, {-2, 4}};
        int[][] actualResult = solution973.kClosest(points, k);
        assertArrayEquals(expectedResult, actualResult);
    }


}
