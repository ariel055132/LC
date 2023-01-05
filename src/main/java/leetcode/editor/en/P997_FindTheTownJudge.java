package leetcode.editor.en;

// $P997_FindTheTownJudge

//leetcode submit region begin(Prohibit modification and deletion)
class Solution997 {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n - 1) {
            return -1;
        }
        int[] count = new int[n + 1];
        for (int[] relation : trust) {
            count[relation[0]]--;
            count[relation[1]]++;
        }

        // i = 1 because people labeled from 1 to n
        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
