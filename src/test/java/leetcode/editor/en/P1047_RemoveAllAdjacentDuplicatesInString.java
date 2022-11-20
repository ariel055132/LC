package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1047_RemoveAllAdjacentDuplicatesInString {

    private Solution1047 solution1047;

    public void setUp() {
        solution1047 = new Solution1047();
    }

    @Test
    void testExample1() {
        setUp();
        String string = "abbaca";
        String expectedResult = "ca";
        String actualResult = solution1047.removeDuplicates(string);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String string = "azxxzy";
        String expectedResult = "ay";
        String actualResult = solution1047.removeDuplicates(string);
        assertEquals(expectedResult, actualResult);
    }
}
