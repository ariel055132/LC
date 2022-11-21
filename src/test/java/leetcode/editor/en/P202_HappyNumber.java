package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P202_HappyNumber {
    private Solution202 solution202;

    public void setUp() {
        solution202 = new Solution202();
    }

    @Test
    void testExample1() {
        setUp();
        int n = 19;
        boolean expectedResult = true;
        boolean actualResult = solution202.isHappy(n);
        assertEquals(expectedResult, actualResult);
    }
}
