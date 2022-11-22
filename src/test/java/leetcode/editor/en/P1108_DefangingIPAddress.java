package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1108_DefangingIPAddress {
    private Solution1108 solution1108;

    public void setUp() {
        solution1108 = new Solution1108();
    }

    @Test
    void testExample1() {
        setUp();
        String address = "1.1.1.1";
        String expectedResult = "1[.]1[.]1[.]1";
        String actualResult = solution1108.defangIPaddr(address);
        assertEquals(expectedResult, actualResult);
    }
}
