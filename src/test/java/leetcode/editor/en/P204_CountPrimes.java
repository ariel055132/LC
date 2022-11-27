package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P204_CountPrimes {
    private Solution204 solution204;

    public void setUp() {
        solution204 = new Solution204();
    }
    @Test
    void testExample1() {
        setUp();
        int n = 10;
        int expectedResult = 4;
        int actualResult = solution204.countPrimes(n);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testExample2() {
        setUp();
        int n = 0;
        int expectedResult = 0;
        int actualResult = solution204.countPrimes(n);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testExample3() {
        setUp();
        int n = 1;
        int expectedResult = 0;
        int actualResult = solution204.countPrimes(n);
        assertEquals(expectedResult, actualResult);
    }
}
