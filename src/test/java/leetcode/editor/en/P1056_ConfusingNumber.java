package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1056_ConfusingNumber {
    private Solution1056 solution1056;

    void setUp() {
        solution1056 = new Solution1056();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int n = 6;
        boolean expectedResult = true;
        boolean actualResult = solution1056.confusingNumber(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int n = 89;
        boolean expectedResult = true;
        boolean actualResult = solution1056.confusingNumber(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3")
    void testExample3() {
        setUp();
        int n = 11;
        boolean expectedResult = false;
        boolean actualResult = solution1056.confusingNumber(n);
        assertEquals(expectedResult, actualResult);
    }
}
