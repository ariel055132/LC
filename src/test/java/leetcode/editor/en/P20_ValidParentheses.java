package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P20_ValidParentheses {
    private Solution20 solution20;

    public void setUp() {
        solution20 = new Solution20();
    }

    @Test
    void testExample1() {
        setUp();
        String s = "()";
        boolean expectedResult = true;
        boolean actualResult = solution20.isValid(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String s = "()[]{}";
        boolean expectedResult = true;
        boolean actualResult = solution20.isValid(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String s = "([";
        boolean expectedResult = false;
        boolean actualResult = solution20.isValid(s);
        assertEquals(expectedResult, actualResult);
    }
}
