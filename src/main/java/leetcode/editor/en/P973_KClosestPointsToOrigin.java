package leetcode.editor.en;

// $P973_KClosestPointsToOrigin

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        int[] distance = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            distance[i] = calDistance(points[i]);
        }
        Arrays.sort(distance);
        int distanceK = distance[k-1];
        int[][] result = new int[k][2];
        int index = 0;
        for (int i = 0; i < points.length; i++) {
            if (calDistance(points[i]) <= distanceK) {
                result[index] = points[i];
                index++;
            }
        }
        return result;
    }

    public int calDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
