package leetcode.editor.en;

// $P223_RectangleArea

//leetcode submit region begin(Prohibit modification and deletion)
class Solution223 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int result = 0;
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        System.out.println(area1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        System.out.println(area2);
        int xOverlap = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int yOverlap = Math.min(ay2, by2) - Math.max(ay1, by1);
        if (xOverlap > 0 && yOverlap > 0) {
            result = area1 + area2 - xOverlap * yOverlap;
        } else {
            result = area1 + area2;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
