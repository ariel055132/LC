package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P387_FirstUniqueCharacterInString {
    private Solution387 solution387;

    public void setUp() {
        solution387 = new Solution387();
    }

    @Test
    void testExample1() {
        setUp();
        String s = "leetcode";
        int expectedResult = 0;
        int actualResult = solution387.firstUniqChar(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        String s = "loveleetcode";
        int expectedResult = 2;
        int actualResult = solution387.firstUniqChar(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        String s = "aabb";
        int expectedResult = -1;
        int actualResult = solution387.firstUniqChar(s);
        assertEquals(expectedResult, actualResult);
    }

}
