package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P944_DeleteColumnsToMakeSortedArray {
    private Solution944 solution944;

    public void setUp() {
        solution944 = new Solution944();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        solution944 = new Solution944();
        String[] strs = {"cba", "daf", "ghi"};
        int expectedResult = 1;
        int actualResult = solution944.minDeletionSize(strs);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        solution944 = new Solution944();
        String[] strs = {"a", "b"};
        int expectedResult = 0;
        int actualResult = solution944.minDeletionSize(strs);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 3")
    void testExample3() {
        solution944 = new Solution944();
        String[] strs = {"zyx", "wvu", "tsr"};
        int expectedResult = 3;
        int actualResult = solution944.minDeletionSize(strs);
        assertEquals(expectedResult, actualResult);
    }
}
