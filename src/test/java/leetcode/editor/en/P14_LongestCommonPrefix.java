package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P14_LongestCommonPrefix {
    private Solution14 solution14;

    public void setUp() {
        solution14 = new Solution14();
    }

    @Test
    void testExample1() {
        setUp();
        String[] strs = {"flower", "flow", "flight"};
        String expectedResult = "fl";
        String actualResult = solution14.longestCommonPrefix(strs);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String[] strs = {"dog", "racecar", "car"};
        String expectedResult = "";
        String actualResult = solution14.longestCommonPrefix(strs);
        assertEquals(expectedResult, actualResult);
    }
}
