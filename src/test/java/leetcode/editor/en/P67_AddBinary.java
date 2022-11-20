package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P67_AddBinary {

    private Solution67 solution67;

    public void setUp() {
        solution67 = new Solution67();
    }

    @Test
    void testExample1() {
        setUp();
        String a = "11";
        String b = "1";
        String expectedResult = "100";
        String actualResult = solution67.addBinary(a, b);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String a = "1010";
        String b = "1011";
        String expectedResult = "10101";
        String actualResult = solution67.addBinary(a, b);
        assertEquals(expectedResult, actualResult);
    }
}
