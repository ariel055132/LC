package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P451_SortCharactersByFrequency {
    private Solution451 solution451;

    public void setUp() {
        solution451 = new Solution451();
    }
    @Test
    void testExample1() {
        setUp();
        String string = "tree";
        String expectedResult = "eert";
        String actualResult = solution451.frequencySort(string);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String string = "cccaaa";
        String expectedResult = "aaaccc";
        String actualResult = solution451.frequencySort(string);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String string = "Aabb";
        String expectedResult = "bbAa";
        String actualResult = solution451.frequencySort(string);
        assertEquals(expectedResult, actualResult);
    }
}
