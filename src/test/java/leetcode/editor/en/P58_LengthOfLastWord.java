package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P58_LengthOfLastWord {

    private Solution58 solution58;

    public void setUp() {
        solution58 = new Solution58();
    }

    @Test
    void testExample1() {
        setUp();
        String string = "Hello World";
        int expectedResult = 5;
        int actualResult = solution58.lengthOfLastWord(string);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String string = "   fly me   to   the moon  ";
        int expectedResult = 4;
        int actualResult = solution58.lengthOfLastWord(string);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String string = "luffy is still joyboy";
        int expectedResult = 6;
        int actualResult = solution58.lengthOfLastWord(string);
        assertEquals(expectedResult, actualResult);
    }
}
