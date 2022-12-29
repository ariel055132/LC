package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2279_MaximumBagsWithFullCapacityOfRocks {
    private Solution2279 solution2279;

    public void setUp() {
        solution2279 = new Solution2279();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[] capacity = {2, 3, 4, 5};
        int[] rocks = {1, 2, 4, 4};
        int additionalRocks = 2;
        int expectedResult = 3;
        int actualResult = solution2279.maximumBags(capacity, rocks, additionalRocks);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[] capacity = {10, 2, 2};
        int[] rocks = {2, 2, 0};
        int additionalRocks = 100;
        int expectedResult = 3;
        int actualResult = solution2279.maximumBags(capacity, rocks, additionalRocks);
        assertEquals(expectedResult, actualResult);
    }
}
