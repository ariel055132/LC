package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P326_PowerOfThree {
    private Solution326 solution326;

    public void setUp() {
        solution326 = new Solution326();
    }
    @Test
    void testExample1() {
        setUp();
        int n = 27;
        boolean expectedResult = true;
        boolean actualResult = solution326.isPowerOfThree(n);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testExample2() {
        setUp();
        int n = 0;
        boolean expectedResult = false;
        boolean actualResult = solution326.isPowerOfThree(n);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void testExample3() {
        setUp();
        int n = -1;
        boolean expectedResult = false;
        boolean actualResult = solution326.isPowerOfThree(n);
        assertEquals(expectedResult, actualResult);
    }


}
