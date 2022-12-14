package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P136_SingleNumber {
    private Solution136 solution136;

    public void setUp() {
        solution136 = new Solution136();
    }

    @Test
    void testExample1_method1() {
        setUp();
        int[] nums = {2, 2, 1};
        int expectedResult = 1;
        int actualResult = solution136.singleNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method1() {
        setUp();
        int[] nums = {4, 1, 2, 1, 2};
        int expectedResult = 4;
        int actualResult = solution136.singleNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3_method1() {
        setUp();
        int[] nums = {1};
        int expectedResult = 1;
        int actualResult = solution136.singleNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample1_method2() {
        setUp();
        int[] nums = {2, 2, 1};
        int expectedResult = 1;
        int actualResult = solution136.singleNumber1(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method2() {
        setUp();
        int[] nums = {4, 1, 2, 1, 2};
        int expectedResult = 4;
        int actualResult = solution136.singleNumber1(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3_method3() {
        setUp();
        int[] nums = {1};
        int expectedResult = 1;
        int actualResult = solution136.singleNumber1(nums);
        assertEquals(expectedResult, actualResult);
    }
}
