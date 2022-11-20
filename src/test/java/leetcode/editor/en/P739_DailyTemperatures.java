package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P739_DailyTemperatures {
    private Solution739 solution739;

    public void setUp() {
        solution739 = new Solution739();
    }

    @Test
    void testExample1() {
        setUp();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expectedResult = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] actualResult = solution739.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] temperatures = {30, 40, 50, 60};
        int[] expectedResult = {1, 1, 1, 0};
        int[] actualResult = solution739.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] temperatures = {30, 60, 90};
        int[] expectedResult = {1, 1, 0};
        int[] actualResult = solution739.dailyTemperatures(temperatures);
        assertArrayEquals(actualResult, expectedResult);
    }
}
