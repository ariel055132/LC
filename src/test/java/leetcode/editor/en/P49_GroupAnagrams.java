package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class P49_GroupAnagrams {
    private Solution49 solution49;

    public void setUp() {
        solution49 = new Solution49();
    }

    @Test
    void testExample1() {
        setUp();
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expectedResult = new ArrayList<>();
        expectedResult.add(Arrays.asList("bat"));
        expectedResult.add(Arrays.asList("nat", "tan"));
        expectedResult.add(Arrays.asList("ate", "eat", "tea"));
        List<List<String>> actualResult = solution49.groupAnagrams(strings);
        // Check the results ignoring ordering
        Assertions.assertEquals(expectedResult.size(), actualResult.size());
        Assertions.assertTrue(expectedResult.containsAll(actualResult));
        Assertions.assertTrue(actualResult.containsAll(expectedResult));
    }
}
