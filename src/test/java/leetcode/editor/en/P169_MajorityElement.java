package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P169_MajorityElement {
    private Solution169 solution169;

    public void setUp() {
        solution169 = new Solution169();
    }

    @Test
    void testExample1_method1() {
        setUp();
        int[] nums = {3, 2, 3};
        int expectedResult = 3;
        int actualResult = solution169.majorityElement(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method1() {
        setUp();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expectedResult = 2;
        int actualResult = solution169.majorityElement(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample1_method2() {
        setUp();
        int[] nums = {3, 2, 3};
        int expectedResult = 3;
        int actualResult = solution169.majorityElement1(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method2() {
        setUp();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expectedResult = 2;
        int actualResult = solution169.majorityElement1(nums);
        assertEquals(expectedResult, actualResult);
    }
}
