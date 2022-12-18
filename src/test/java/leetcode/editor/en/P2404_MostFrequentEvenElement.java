package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2404_MostFrequentEvenElement {
    private Solution2404 solution2404;

    public void setUp() {
        solution2404 = new Solution2404();
    }

    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        int[] nums = {0, 1, 2, 2, 4, 4, 1};
        int expectedResult = 2;
        int actualResult = solution2404.mostFrequentEven(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        int[] nums = {4, 4, 4, 9, 2, 4};
        int expectedResult = 4;
        int actualResult = solution2404.mostFrequentEven(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC Hidden TestCase")
    void testHidden() {
        setUp();
        int[] nums = {8267,8727,2649,7359,2142,7824,7399,3424,8868,476,9769,4631,6631,4205,9178,7920,4748,5523,74,5550,516,6448,3475,7867,7041,5896,4382,2066,8101,674,67,9311,4308,1693,4586,3959,2973,2158,5067,9060,2988,1147,1746,9722,8550,9126,3029,1677,4154,5473,6589,5381,1486,8699,792,8349,6773,496,4505,6163,6843,1232,4809,4432,6251,7658,4949,1419,7005,3815,6295,4635,7785,4891,6941,6952,7218,134,2718,7409,9551};
        int expectedResult = 74;
        int actualResult = solution2404.mostFrequentEven(nums);
        assertEquals(expectedResult, actualResult);
    }
}
