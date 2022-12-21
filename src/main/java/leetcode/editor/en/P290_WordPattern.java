package leetcode.editor.en;

// $P290_WordPattern

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (map.containsKey(c)) {
                if (map.get(c).equals(w) == false) {
                    return false;
                }
            } else {
                if (map.containsValue(w)) {
                    return false;
                } else {
                    map.put(c, w);
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
