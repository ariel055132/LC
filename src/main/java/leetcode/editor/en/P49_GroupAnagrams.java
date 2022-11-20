package leetcode.editor.en;

// $P49_GroupAnagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            // Convert string to char array for sorting with alphabet
            char[] charArray = strs[i].toCharArray();
            // Sorting
            Arrays.sort(charArray);
            // convert char array to string
            String keyStr = String.valueOf(charArray);
            if (!hashMap.containsKey(keyStr)) {
                hashMap.put(keyStr, new ArrayList<String>());
            }
            hashMap.get(keyStr).add(strs[i]);

        }
        // traverse the hashMap and insert the corresponding result
        for (String key : hashMap.keySet()) {
            result.add(hashMap.get(key));
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
