package leetcode.editor.en;

// $P54_SpiralMatrix

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return result;
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int direction = 0;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // add direction to pass test case 2
            switch(direction) {
                case 0:
                    // left to right (Right)
                    for (int i = colStart; i <= colEnd; i++) {
                        result.add(matrix[rowStart][i]);
                    }
                    rowStart++;
                    break;
                case 1:
                    // top to bottom (Down)
                    for (int i = rowStart; i <= rowEnd; i++) {
                        result.add(matrix[i][colEnd]);
                    }
                    colEnd--;
                    break;
                case 2:
                    // right to left (Left)
                    for (int i = colEnd; i >= colStart ; i--) {
                        result.add(matrix[rowEnd][i]);
                    }
                    rowEnd--;
                    break;
                case 3:
                    // bottom to top (Up)
                    for (int i = rowEnd; i >= rowStart; i--) {
                        result.add(matrix[i][colStart]);
                    }
                    colStart++;
                    break;
            }
            direction = (direction + 1) % 4;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
