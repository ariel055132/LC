package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P125_ValidPalindrome {
    private Solution125 solution125;

    public void setUp() {
        solution125 = new Solution125();
    }

    @Test
    void testExample1() {
        setUp();
        String s = "A man, a plan, a canal: Panama";
        Boolean expectedResult = true;
        Boolean actualResult = solution125.isPalindrome(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String s = "race a car";
        Boolean expectedResult = false;
        Boolean actualResult = solution125.isPalindrome(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String s = " ";
        Boolean expectedResult = true;
        Boolean actualResult = solution125.isPalindrome(s);
        assertEquals(expectedResult, actualResult);
    }
}
