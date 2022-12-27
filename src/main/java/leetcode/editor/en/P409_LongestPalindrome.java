package leetcode.editor.en;

// $P409_LongestPalindrome

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution409 {
    public int longestPalindrome(String s) {
        int ans = 0;
        boolean isOdd = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (map.containsKey(character)) {
                int count = map.get(character);
                map.put(character, ++count);
            } else {
                map.put(character, 1);
            }
        }
        for (int i : map.values()) {
            if (i % 2 == 0) {
                ans += i;
            } else if (i % 2 == 1){
                ans += (i - 1);
                isOdd = true;
            }
        }
        if (isOdd) {
            ans++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
