package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1249_MinRemoveToMakeValidParentheses {
    private Solution1249 solution1249;

    public void setUp() {
        solution1249 = new Solution1249();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testCase1() {
        setUp();
        String input = "lee(t(c)o)de)";
        String expectedResult = "lee(t(c)o)de";
        String actualResult = solution1249.minRemoveToMakeValid(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testCase2() {
        setUp();
        String input = "a)b(c)d";
        String expectedResult = "ab(c)d";
        String actualResult = solution1249.minRemoveToMakeValid(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3")
    void testCase3() {
        setUp();
        String input = "))((";
        String expectedResult = "";
        String actualResult = solution1249.minRemoveToMakeValid(input);
        assertEquals(expectedResult, actualResult);
    }
}
