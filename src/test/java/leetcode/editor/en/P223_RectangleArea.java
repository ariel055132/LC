package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P223_RectangleArea {
    private Solution223 solution223;

    public void setUp() {
        solution223 = new Solution223();
    }

    @Test
    void testExample1() {
        setUp();
        int ax1 = -3; int ay1 = 0; int ax2 = 3; int ay2 = 4;
        int bx1 = 0; int by1 = -1; int bx2 = 9; int by2 = 2;
        int expectedResult = 45;
        int actualResult = solution223.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int ax1 = -2; int ay1 = -2; int ax2 = 2; int ay2 = 2;
        int bx1 = -2; int by1 = -2; int bx2 = 2; int by2 = 2;
        int expectedResult = 16;
        int actualResult = solution223.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        assertEquals(expectedResult, actualResult);
    }
}
