package leetcode.editor.en;

// $P149_MaxPointsOnALine

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution149 {
    public int maxPoints(int[][] points) {
        if (points.length == 1) {
            return 1;
        }
        int result = 0;

        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                double slope = calculateSlope(points[i], points[j]);

                if (map.containsKey(slope)) {
                    int count = map.get(slope);
                    map.put(slope, ++count);
                } else {
                    map.put(slope, 1);
                }

                result = Math.max(result, map.get(slope));
            }
        }
        return result + 1;
    }

    private double calculateSlope(int[] pt1, int[] pt2) {
        int x1 = pt1[0], x2 = pt2[0];
        int y1 = pt1[1], y2 = pt2[1];
        // Vertical line --> inf. slope
        if (x1 == x2) {
            return Double.MAX_VALUE;
        }
        // Horizontal line --> slope == 0
        if (y1 == y2) {
            return 0;
        }
        // Normal Case --> Calculate the slope with formula (y2 - y1) / (x2 - x1)
        return (double) (y2 - y1) / (double) (x2 - x1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
