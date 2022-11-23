package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1528_ShuffleString {
    private Solution1528 solution1528;

    public void setUp() {
        solution1528 = new Solution1528();
    }
    @Test
    void testExample1() {
        setUp();
        String string = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String expectedResult = "leetcode";
        String actualResult = solution1528.restoreString(string, indices);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String string = "abc";
        int[] indices = {0, 1, 2};
        String expectedResult = "abc";
        String actualResult = solution1528.restoreString(string, indices);
        assertEquals(expectedResult, actualResult);
    }
}
