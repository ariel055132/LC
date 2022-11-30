package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1207_UniqueNumberOfOccurences {
    private Solution1207 solution1207;

    public void setUp() {
        solution1207 = new Solution1207();
    }

    @Test
    void testExample1() {
        setUp();
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean expectedResult = true;
        boolean actualResult = solution1207.uniqueOccurrences(arr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] arr = {1, 2};
        boolean expectedResult = false;
        boolean actualResult = solution1207.uniqueOccurrences(arr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean expectedResult = true;
        boolean actualResult = solution1207.uniqueOccurrences(arr);
        assertEquals(expectedResult, actualResult);
    }
}
