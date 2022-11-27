package leetcode.editor.en;

// $P387_FirstUniqueCharacterInAString

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (!hashtable.containsKey(s.charAt(i))) {
                hashtable.put(s.charAt(i), 1);
            } else {
                int count = hashtable.get(s.charAt(i));
                hashtable.put(s.charAt(i), ++count);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashtable.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
