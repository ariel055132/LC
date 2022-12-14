package leetcode.editor.en;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P722_RemoveComments {
    private Solution722 solution722;

    public void setUp() {
        solution722 = new Solution722();
    }

    @Test
    @DisplayName("Test with // comment only")
    void testExample1() {
        setUp();
        String[] input = {"// variable declaration ", "int a, b, c"};
        List<String> expectedResult = Arrays.asList("int a, b, c");
        List<String> actualResult = solution722.removeComments(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test with /* */ comment only")
    void testExample2() {
        setUp();
        String[] input = {"/* variable declaration */", "int a, b, c", "int e, f"};
        List<String> expectedResult = Arrays.asList("int a, b, c", "int e, f");
        List<String> actualResult = solution722.removeComments(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test with /* */ comment between multiple lines")
    void testExample3() {
        setUp();
        String[] input = {"/* variable declaration", "hi hi */", "int a, b, c", "int d, e, f"};
        List<String> expectedResult = Arrays.asList("int a, b, c", "int d, e, f");
        List<String> actualResult = solution722.removeComments(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test with /* */ and // comment")
    void testExample4() {
        setUp();
        String[] input = {"/* variable declaration", "hi hi */", "int a, b, c", "int d, e, f", "// finish"};
        List<String> expectedResult = Arrays.asList("int a, b, c", "int d, e, f");
        List<String> actualResult = solution722.removeComments(input);
        assertEquals(expectedResult, actualResult);
    }
}
