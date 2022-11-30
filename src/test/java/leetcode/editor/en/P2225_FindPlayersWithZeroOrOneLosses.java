package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2225_FindPlayersWithZeroOrOneLosses {
    private Solution2225 solution2225;

    public void setUp() {
        solution2225 = new Solution2225();
    }
    @Test
    void testExample1() {
        setUp();
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> expectedResult = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 10)),
                new ArrayList<>(Arrays.asList(4, 5, 7, 8))
        ));
        List<List<Integer>> actualResult = solution2225.findWinners(matches);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testExample2() {
        setUp();
        int[][] matches = {{2,3},{1,3},{5,4},{6,4}};
        List<List<Integer>> expectedResult = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 5, 6)),
                new ArrayList<>(Arrays.asList())
        ));
        List<List<Integer>> actualResult = solution2225.findWinners(matches);
        assertEquals(expectedResult, actualResult);
    }
}
