package leetcode.editor.en;

// $P204_CountPrimes

//leetcode submit region begin(Prohibit modification and deletion)
class Solution204 {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] numbers = new boolean[n];
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (numbers[i] == false) {
                for (int j = i*i; j < n; j+=i) {
                    numbers[j] = true;
                }
            }
        }

        int result = 0;
        for (int i = 2; i < n; i++) {
            if (numbers[i] == false) {
                result++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
