package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2244_MinimumRoundsToCompleteAllTasks {
    private Solution2244 solution2244;

    public void setUp() {
        solution2244 = new Solution2244();
    }

    @Test
    @DisplayName("LC TestCase 1: Positive Case")
    void testExample1() {
        setUp();
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        int expectedResult = 4;
        int actualResult = solution2244.minimumRounds(tasks);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2: Negative Case")
    void testExample2() {
        setUp();
        int[] tasks = {2, 3, 3};
        int expectedResult = -1;
        int actualResult = solution2244.minimumRounds(tasks);;
        assertEquals(expectedResult, actualResult);
    }
}
