package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P290_WordPattern {
    private Solution290 solution290;

    public void setUp() {
        solution290 = new Solution290();
    }

    @Test
    @DisplayName("Test different length of pattern and s")
    void testExample() {
        setUp();
        String pattern = "abb";
        String s = "dog cat cat dog";
        Boolean expectedResult = false;
        Boolean actualResult = solution290.wordPattern(pattern, s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 1: Positive TestCase")
    void testExample1() {
        setUp();
        String pattern = "abba";
        String s = "dog cat cat dog";
        Boolean expectedResult = true;
        Boolean actualResult = solution290.wordPattern(pattern, s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2: Negative TestCase")
    void testExample2() {
        setUp();
        String pattern = "abba";
        String s = "dog cat cat fish";
        Boolean expectedResult = false;
        Boolean actualResult = solution290.wordPattern(pattern, s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3: Other TestCase")
    void testExample3() {
        setUp();
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        Boolean expectedResult = false;
        Boolean actualResult = solution290.wordPattern(pattern, s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC Hidden TestCase")
    void testExample4() {
        setUp();
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        Boolean expectedResult = true;
        Boolean actualResult = solution290.wordPattern(pattern, s);
        assertEquals(expectedResult, actualResult);
    }
}
