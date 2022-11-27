package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P242_ValidAnagram {
    private Solution242 solution242;

    public void setUp() {
        solution242 = new Solution242();
    }

    @Test
    void testExample1_method1() {
        setUp();
        String s = "anagram";
        String t = "nagaram";
        Boolean expectedResult = true;
        Boolean actualResult = solution242.isAnagram(s, t);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method1() {
        setUp();
        String s = "rat";
        String t = "car";
        Boolean expectedResult = false;
        Boolean actualResult = solution242.isAnagram(s, t);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3_method1() {
        // Test two strings with different length
        setUp();
        String s = "ab";
        String t = "a";
        Boolean expectedResult = false;
        Boolean actualResult = solution242.isAnagram(s, t);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample1_method2() {
        setUp();
        String s = "anagram";
        String t = "nagaram";
        Boolean expectedResult = true;
        Boolean actualResult = solution242.isAnagram1(s, t);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2_method2() {
        setUp();
        String s = "rat";
        String t = "car";
        Boolean expectedResult = false;
        Boolean actualResult = solution242.isAnagram1(s, t);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3_method2() {
        setUp();
        String s = "ab";
        String t = "abc";
        Boolean expectedResult = false;
        Boolean actualResult = solution242.isAnagram1(s, t);
        assertEquals(expectedResult, actualResult);
    }
}
