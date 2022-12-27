package leetcode.editor.en;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class P187_RepeatedDNASequences {
    private Solution187 solution187;

    void setUp() {
        solution187 = new Solution187();
    }


    @Test
    @DisplayName("LC TestCase 1")
    void testExample1() {
        setUp();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String[] a = new String[] {"AAAAACCCCC","CCCCCAAAAA"};
        List<String> expectedResult = Arrays.asList(a);
        List<String> actualResult = solution187.findRepeatedDnaSequences(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("LC TestCase 2")
    void testExample2() {
        setUp();
        String s = "AAAAAAAAAAAAA";
        String[] a = new String[] {"AAAAAAAAAA"};
        List<String> expectedResult = Arrays.asList(a);
        List<String> actualResult = solution187.findRepeatedDnaSequences(s);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test with string len < 10")
    void testExample3() {
        setUp();
        String s = "AAAAAAAAA";
        String[] a = new String[] {};
        List<String> expectedResult = Arrays.asList(a);
        List<String> actualResult = solution187.findRepeatedDnaSequences(s);
        assertEquals(expectedResult, actualResult);
    }
}
