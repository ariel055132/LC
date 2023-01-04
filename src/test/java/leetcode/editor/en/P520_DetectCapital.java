package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P520_DetectCapital {
    private Solution520 solution520;

    public void setUp() {
        solution520 = new Solution520();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        String word = "USA";
        boolean expectedResult = true;
        boolean actualResult = solution520.detectCapitalUse(word);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        String word = "FlaG";
        boolean expectedResult = false;
        boolean actualResult = solution520.detectCapitalUse(word);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3")
    void testExample3() {
        setUp();
        String word = "Leetcode";
        boolean expectedResult = true;
        boolean actualResult = solution520.detectCapitalUse(word);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 4")
    void testExample4() {
        setUp();
        String word = "LeetCode";
        boolean expectedResult = false;
        boolean actualResult = solution520.detectCapitalUse(word);
        assertEquals(expectedResult, actualResult);
    }
}
