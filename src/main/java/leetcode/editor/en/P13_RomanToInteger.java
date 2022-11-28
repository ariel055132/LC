package leetcode.editor.en;

// $P13_RomanToInteger

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution13 {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    public void init() {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }
    public int romanToInt(String s) {
        init();
        int result = 0;
        int index = 0;
        while (index < s.length()) {
            int currentValue = hashMap.get(s.charAt(index));
            int nextValue;
            if (index + 1 < s.length()) {
                nextValue = hashMap.get(s.charAt(index+1));
            } else {
                nextValue = 0;
            }
            if (nextValue > currentValue) {
                result += nextValue - currentValue;
                index += 2;
            } else {
                result += currentValue;
                index++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
