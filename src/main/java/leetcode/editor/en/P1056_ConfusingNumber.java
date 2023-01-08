package leetcode.editor.en;

// $P1056_ConfusingNumber

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1056 {
    public boolean confusingNumber(int n) {
        Map<Character, Character> map = new HashMap();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        String strN = Integer.toString(n);
        char[] charN = strN.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charN) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                sb.append(map.get(c));
            }
        }
        sb.reverse();
        return Integer.parseInt(sb.toString()) != n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
