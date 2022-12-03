package leetcode.editor.en;

// $P451_SortCharactersByFrequency

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution451 {
    public String frequencySort(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // Count the occurences of char in the string s
        for (char c : s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                int count = hashMap.get(c);
                count++;
                hashMap.put(c, count);
            }
        }

        // Sort the hashmap by value descendency
        List<Character> integerList = new ArrayList<>(hashMap.keySet());
        Collections.sort(integerList, (a, b) -> hashMap.get(b) - hashMap.get(a));

        // Convert the counts into a string with stringbuilder
        for (char c : integerList) {
            int tmp = hashMap.get(c);
            for (int i = 0; i < tmp; i++) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
