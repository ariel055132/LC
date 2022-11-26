package leetcode.editor.en;

// $P122_BestTimeToBuyAndSellStockII

//leetcode submit region begin(Prohibit modification and deletion)
class Solution122 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int valley = prices[0];
        int peak = prices[0];
        int index = 0;
        while (index < prices.length - 1) {
            while (index < prices.length - 1 && prices[index] >= prices[index + 1]) {
                index++;
            }
            valley = prices[index];
            while (index < prices.length - 1 && prices[index] <= prices[index + 1]) {
                index++;
            }
            peak = prices[index];
            result += peak - valley;
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
