package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P371_SumOfTwoIntegers {
    private Solution371 solution371;

    public void setUp() {
        solution371 = new Solution371();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        int actualResult = solution371.getSum(a,b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int a = 2;
        int b = 3;
        int expectedResult = 5;
        int actualResult = solution371.getSum(a, b);
        assertEquals(expectedResult, actualResult);
    }
}
