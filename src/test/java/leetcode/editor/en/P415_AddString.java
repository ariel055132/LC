package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P415_AddString {
    private Solution415 solution415;

    void setUp() {
        solution415 = new Solution415();
    }

    @Test
    @DisplayName("Example 1 TestCase")
    void testExample1() {
        setUp();
        String num1 = "11";
        String num2 = "123";
        String expectedResult = "134";
        String actualResult = solution415.addStrings(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Example 2 TestCase")
    void testExample2() {
        setUp();
        String num1 = "456";
        String num2 = "77";
        String expectedResult = "533";
        String actualResult = solution415.addStrings(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Example 3 TestCase")
    void testExample3() {
        setUp();
        String num1 = "0";
        String num2 = "0";
        String expectedResult = "0";
        String actualResult = solution415.addStrings(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}
