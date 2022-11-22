package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2011_FinalValueVariableAfterPerformingOperations {
    private Solution2011 solution2011;

    public void setUp() {
        solution2011 = new Solution2011();
    }

    @Test
    void testExample1() {
        setUp();
        String[] operations = {"--X", "X++", "X++"};
        int expectedResult = 1;
        int actualResult = solution2011.finalValueAfterOperations(operations);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String[] operations = {"++X", "++X", "X++"};
        int expectedResult = 3;
        int actualResult = solution2011.finalValueAfterOperations(operations);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String[] operations = {"X++", "++X", "--X", "X--"};
        int expectedResult = 0;
        int actualResult = solution2011.finalValueAfterOperations(operations);
        assertEquals(expectedResult, actualResult);
    }
}
