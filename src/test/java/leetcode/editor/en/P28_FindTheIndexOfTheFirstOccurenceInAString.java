package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P28_FindTheIndexOfTheFirstOccurenceInAString {

    private Solution28 solution28;

    public void setUp() {
        solution28 = new Solution28();
    }

    @Test
    void testExample1() {
        setUp();
        String haystack = "sadbutsad";
        String needle = "sad";
        int expectedResult = 0;
        int actualResult = solution28.strStr(haystack, needle);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String haystack = "leetcode";
    }

    @Test
    void testExample1_v2() {
        setUp();
        String haystack = "sadbutsad";
        String needle = "sad";
        int expectedResult = 0;
        int actualResult = solution28.strStr2(haystack, needle);
        assertEquals(expectedResult, actualResult);
    }
}
