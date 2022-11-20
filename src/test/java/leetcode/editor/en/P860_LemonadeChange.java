package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P860_LemonadeChange {
    private Solution860 solution860;

    public void setUp() {
        solution860 = new Solution860();
    }

    @Test
    void testExample1() {
        setUp();
        int[] bills = {5, 5, 5, 10, 20};
        boolean expectedResult = true;
        boolean actualResult = solution860.lemonadeChange(bills);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[] bills = {5, 5, 10, 10, 20};
        boolean expectedResult = false;
        boolean actualResult = solution860.lemonadeChange(bills);
        assertEquals(expectedResult, actualResult);
    }
}
