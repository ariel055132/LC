package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P896_MonotonicArray {

    private Solution896 solution896;

    public void setUp() {
        solution896 = new Solution896();
    }

    @Test
    void testExample1() {
        setUp();
        int[] input = {1, 2, 2, 3};
        boolean expectedResult = true;
        boolean actualResult = solution896.isMonotonic(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] input = {6, 5, 4, 4};
        boolean expectedResult = true;
        boolean actualResult = solution896.isMonotonic(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] input = {1, 3, 2};
        boolean expectedResult = false;
        boolean actualResult = solution896.isMonotonic(input);
        assertEquals(expectedResult, actualResult);
    }
}
