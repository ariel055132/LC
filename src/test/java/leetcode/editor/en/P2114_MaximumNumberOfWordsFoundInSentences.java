package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2114_MaximumNumberOfWordsFoundInSentences {
    private Solution2114 solution2114;

    public void setUp() {
        solution2114 = new Solution2114();
    }

    @Test
    void testExample1() {
        setUp();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int expectedResult = 6;
        int actualResult = solution2114.mostWordsFound(sentences);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int expectedResult = 3;
        int actualResult = solution2114.mostWordsFound(sentences);
        assertEquals(expectedResult, actualResult);
    }
}
