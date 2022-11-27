package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P7_ReverseInteger {
    private Solution7 solution7;

    public void setUp() {
        solution7 = new Solution7();
    }
    @Test
    void testExample1() {
        setUp();
        int x = 123;
        int expectedResult = 321;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int x = -123;
        int expectedResult = -321;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int x = 120;
        int expectedResult = 21;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample4() {
        setUp();
        int x = 1534236469;
        int expectedResult = 0;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }
}
