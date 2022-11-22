package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P771_JewelAndStone {
    private Solution771 solution771;

    public void setUp() {
        solution771 = new Solution771();
    }
    @Test
    void testExample1() {
        setUp();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expectedResult = 3;
        int actualResult = solution771.numJewelsInStones(jewels, stones);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String jewels = "z";
        String stones = "ZZ";
        int expectedResult = 0;
        int actualResult = solution771.numJewelsInStones(jewels, stones);
        assertEquals(expectedResult, actualResult);
    }
}
