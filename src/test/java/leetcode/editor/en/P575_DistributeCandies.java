package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P575_DistributeCandies {

    private Solution575 solution575;

    public void setUp() {
        solution575 = new Solution575();
    }

    @Test
    void testExample1() {
        setUp();
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int expectedResult = 3;
        int actualResult = solution575.distributeCandies(candyType);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] candyType = {1, 1, 2, 3};
        int expectedResult = 2;
        int actualResult = solution575.distributeCandies(candyType);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] candyType = {6, 6, 6, 6};
        int expectedResult = 1;
        int actualResult = solution575.distributeCandies(candyType);
        assertEquals(expectedResult, actualResult);
    }

}
