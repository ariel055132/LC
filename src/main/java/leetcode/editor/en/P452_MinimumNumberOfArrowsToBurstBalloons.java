package leetcode.editor.en;

// $P452_MinimumNumberOfArrowsToBurstBalloons

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        for (int[] point : points) {
            for (int coord : point) {
                System.out.print(coord + " ");
            }
            System.out.println();
        }

        int arrowPosition = points[0][1];
        int result = 1; // One arrow is needed to brust all balloons
        for (int i = 0; i < points.length; i++) {
            if (arrowPosition >= points[i][0]) {
                continue;
            }
            result++;
            arrowPosition = points[i][1];

        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
