package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P15_ThreeSum {
    private Solution15 solution15;

    public void setUp() {
        solution15 = new Solution15();
    }
    @Test
    void testExample1() {
        setUp();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expectedResult = List.of(
                                                List.of(-1, -1, 2),
                                                List.of(-1, 0, 1)
                                            );
        List<List<Integer>> actualResult = solution15.threeSum(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] nums = {0, 1, 1};
        List<List<Integer>> expectedResult = List.of();
        List<List<Integer>> actualResult = solution15.threeSum(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int[] nums = {0, 0 ,0};
        List<List<Integer>> expectedResult = List.of(
                                                List.of(0, 0, 0)
                                                );
        List<List<Integer>> actualResult = solution15.threeSum(nums);
        assertEquals(expectedResult, actualResult);
    }
}
