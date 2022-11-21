package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P66_PlusOne {
    private Solution66 solution66;

    public void setUp() {
        solution66 = new Solution66();
    }

    @Test
    void testExample1() {
        setUp();
        int[] digits = {1, 2, 3};
        int[] expectedResults = {1, 2, 4};
        int[] actualResults = solution66.plusOne(digits);
        assertArrayEquals(expectedResults, actualResults);
    }
}
