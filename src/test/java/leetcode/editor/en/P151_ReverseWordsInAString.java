package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P151_ReverseWordsInAString {

    private Solution151 solution151;

    public void setUp() {
        solution151 = new Solution151();
    }
    @Test
    void testExample1() {
        setUp();
        String input = "the sky is blue";
        String expectedOutput = "blue is sky the";
        String actualOutput = solution151.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testExample2(){
        setUp();
        String input = " hello world  ";
        String expectedOutput = "world hello";
        String actualOutput = solution151.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testExample3() {
        setUp();
        String input = "a good   example";
        String expectedOutput = "example good a";
        String actualOutput = solution151.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
