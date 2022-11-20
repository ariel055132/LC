package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P1630_CheckArithmeticSubarrays {

    private Solution1630 solution1630;

    void setUp() {
        solution1630 = new Solution1630();
    }

    @Test
    void testExample1() {
        setUp();
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};
        Boolean[] expectedResult = {true, false, true};
        Boolean[] actualResult = solution1630.checkArithmeticSubarrays(nums, l, r).toArray(new Boolean[0]);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,0,1,6,4,8,7};
        int[] r = {1,4,4,9,7,9,10};
        Boolean[] expectedResult = {true,false,true,false,false,true,true};
        Boolean[] actualResult = solution1630.checkArithmeticSubarrays(nums, l, r).toArray(new Boolean[0]);
        assertArrayEquals(expectedResult, actualResult);
    }
}
