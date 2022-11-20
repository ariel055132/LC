package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P54_SprialMatrix {

    private Solution54 solution54;

    public void setUp() {
        solution54 = new Solution54();
    }
    @Test
    void testExample1() {
        setUp();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        //int[] expectedResult = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        List<Integer> actualResult = solution54.spiralOrder(matrix);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    void testExample2() {
        setUp();
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        List<Integer> expectedResult = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
        List<Integer> actualResult = solution54.spiralOrder(matrix);
        System.out.println(actualResult);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }
}
