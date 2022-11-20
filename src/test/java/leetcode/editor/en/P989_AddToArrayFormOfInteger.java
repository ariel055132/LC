package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P989_AddToArrayFormOfInteger {

    private Solution989 solution989;

    public void setUp() {
        solution989 = new Solution989();
    }

    @Test
    void testExample1() {
        setUp();
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actualResult = solution989.addToArrayForm(num, k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] num = {2, 7, 4};
        int k = 181;
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(4, 5, 5));
        List<Integer> actualResult = solution989.addToArrayForm(num, k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] num = {2, 1, 5};
        int k = 806;
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 0, 2, 1));
        List<Integer> actualResult = solution989.addToArrayForm(num, k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample4() {
        setUp();
        int[] num = {9, 9 ,9 ,9};
        int k = 1;
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 0, 0, 0, 0));
        List<Integer> actualResult = solution989.addToArrayForm(num, k);
        assertEquals(expectedResult, actualResult);
    }
}
