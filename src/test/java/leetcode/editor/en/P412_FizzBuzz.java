package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P412_FizzBuzz {
    private Solution412 solution412;

    public void setUp() {
        solution412 = new Solution412();
    }
    @Test
    void testExample1() {
        setUp();
        int n = 3;
        List<String> expectedResult = Arrays.asList("1", "2","Fizz");
        List<String> actualResult = solution412.fizzBuzz(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int n = 5;
        List<String> expectedResult = Arrays.asList("1","2","Fizz","4","Buzz");
        List<String> actualResult = solution412.fizzBuzz(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample3() {
        setUp();
        int n = 15;
        List<String> expectedResult = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        List<String> actualResult = solution412.fizzBuzz(n);
        assertEquals(expectedResult, actualResult);
    }
}
