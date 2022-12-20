package leetcode.editor.en;

// $P56_MergeIntervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution56 {
    public int[][] merge(int[][] intervals) {
        // Sort 2d array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		/* Print the sorted 2d array.
		for (int[] x : intervals) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		*/
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            // determine combination is needed
            // If the ending position of intervals[i] >= starting position of intervals[i+1] --> needed
            // new end after combination: Math.max(end, intervals[i+1][1])
            // If combination is not needed, add the current intervals
            while (i < intervals.length-1 && end >= intervals[i+1][0]) {
                end = Math.max(end, intervals[i+1][1]);
                i++;
            }
            result.add(new int[] {start, end});
        }
        return result.toArray(new int[result.size()][2]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
