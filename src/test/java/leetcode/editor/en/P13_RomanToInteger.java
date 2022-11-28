package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P13_RomanToInteger {
    private Solution13 solution13;

    public void setUp() {
        solution13 = new Solution13();
    }
    @Test
    void testExample1() {
        setUp();
        String s = "III";
        int expectedResult = 3;
        int actualResult = solution13.romanToInt(s);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void testExample2() {
        setUp();
        String s = "LVIII";
        int expectedResult = 58;
        int actualResult = solution13.romanToInt(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String s = "MCMXCIV";
        int expectedResult = 1994;
        int actualResult = solution13.romanToInt(s);
        assertEquals(expectedResult, actualResult);
    }
}
