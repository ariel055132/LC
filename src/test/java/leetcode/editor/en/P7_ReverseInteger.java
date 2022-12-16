package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P7_ReverseInteger {
    private Solution7 solution7;

    public void setUp() {
        solution7 = new Solution7();
    }

    @Test
    @DisplayName("General Test Case")
    void testExample1() {
        setUp();
        int x = 123;
        int expectedResult = 321;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("TestCase: negative sign should be kept after reverse")
    void testExample2() {
        setUp();
        int x = -123;
        int expectedResult = -321;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("TestCase: unit digit is 0 should be ignored after reverse")
    void testExample3() {
        setUp();
        int x = 120;
        int expectedResult = 21;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("TestCase: OverFlow")
    void testExample4() {
        setUp();
        int x = 1534236469;
        int expectedResult = 0;
        int actualResult = solution7.reverse(x);
        assertEquals(expectedResult, actualResult);
    }
}
