package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P347_TopKFrequentElements {
    private Solution347 solution347;

    public void setUp() {
        solution347 = new Solution347();
    }
    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expectedResult = {1, 2};
        int[] actualResult = solution347.topKFrequent(nums, k);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[] nums = {1};
        int k = 1;
        int[] expectedResult = {1};
        int[] actualResult = solution347.topKFrequent(nums, k );
        assertArrayEquals(expectedResult, actualResult);
    }
}
