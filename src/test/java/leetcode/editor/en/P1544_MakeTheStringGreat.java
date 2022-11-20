package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1544_MakeTheStringGreat {

    private Solution1544 solution1544;

    public void setUp() {
        solution1544 = new Solution1544();
    }

    @Test
    void testExample1() {
        setUp();
        String s = "leEeetcode";
        String expectedResult = "leetcode";
        String actualResult = solution1544.makeGood(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String s = "abBAcC";
        String expectedResult = "";
        String actualResult = solution1544.makeGood(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String s = "s";
        String expectedResult = "s";
        String actualResult = solution1544.makeGood(s);
        assertEquals(expectedResult, actualResult);
    }

}
