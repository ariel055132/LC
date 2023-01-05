package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P997_FindTheTownjudge {
    private Solution997 solution997;

    public void setUp() {
        solution997 = new Solution997();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[][] trust = {{1, 2}};
        int expectedResult = 2;
        int actualResult = solution997.findJudge(2, trust);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[][] trust = {{1, 3}, {2, 3}};
        int expectedResult = 3;
        int actualResult = solution997.findJudge(3, trust);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3")
    void testExample3() {
        setUp();
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        int expectedResult = -1;
        int actualResult = solution997.findJudge(3, trust);
        assertEquals(expectedResult, actualResult);
    }
}
