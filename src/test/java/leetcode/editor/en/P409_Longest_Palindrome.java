package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P409_Longest_Palindrome {
    private Solution409 solution409;

    public void setUp() {
        solution409 = new Solution409();
    }

    @Test
    void testExample1() {
        setUp();
        String s = "abccccdd";
        int expectedResult = 7;
        int actualResult = solution409.longestPalindrome(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String s = "a";
        int expectedResult = 1;
        int actualResult = solution409.longestPalindrome(s);
        assertEquals(expectedResult, actualResult);
    }
}
