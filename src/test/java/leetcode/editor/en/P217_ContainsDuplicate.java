package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P217_ContainsDuplicate {
    private Solution217 solution217;

    public void setUp() {
        solution217 = new Solution217();
    }

    @Test
    void testExample1() {
        setUp();
        int[] nums = {1, 2, 3, 1};
        boolean expectedResult = true;
        boolean actualResult = solution217.containsDuplicate(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] nums = {1, 2, 3, 4};
        boolean expectedResult = false;
        boolean actualResult = solution217.containsDuplicate(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expectedResult = true;
        boolean actualResult = solution217.containsDuplicate(nums);
        assertEquals(expectedResult, actualResult);
    }
}
