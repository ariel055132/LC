package leetcode.editor.en;

// $P242_ValidAnagram

import java.util.Arrays;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution242 {
    // Approach 1: Sorting
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    // Approach 2: HashMap
    public boolean isAnagram1(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
            hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : hashMap.keySet()) {
            if (hashMap.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
