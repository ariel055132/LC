package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P122_BestTimeToBuyAndSellStockII {
    private Solution122 solution122;

    public void setUp() {
        solution122 = new Solution122();
    }

    @Test
    void testExample1() {
        setUp();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expectedResult = 7;
        int actualResult = solution122.maxProfit(prices);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] prices = {1, 2, 3, 4, 5};
        int expectedResult = 4;
        int actualResult = solution122.maxProfit(prices);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] prices = {7, 6, 4, 3, 1};
        int expectedResult = 0;
        int actualResult = solution122.maxProfit(prices);
        assertEquals(expectedResult, actualResult);
    }
}
