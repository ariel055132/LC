package leetcode.editor.en;

// $P187_RepeatedDNASequences

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        if (s == null || s.length() < 10) {
            return new ArrayList<>(repeated);
        }

        for (int i = 0; i + 9 < s.length(); i++) {
            String tmpString = s.substring(i, i + 10);
            if (set.contains(tmpString)) {
                repeated.add(tmpString);
            } else {
                set.add(tmpString);
            }
        }
        return new ArrayList<>(repeated);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
